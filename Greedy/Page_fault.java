class Solution{
    static int pageFaults(int N, int C, int pages[]){
        // code here
 Queue<Integer> q=new LinkedList<>();
 int cn=0;
 for(int i=0;i<N;i++)
 {
     if(q.contains(pages[i]) || q.size()<C)
     {
         if(!q.contains(pages[i]))
         {
             cn++;
             q.add(pages[i]);
         }
         else
         {
             q.remove(new Integer(pages[i]));
             q.add(pages[i]);
         }
     }
     else
     {
         cn++;
         q.poll();
         q.add(pages[i]);
     }
 }
        
     return cn;   
    }
}
