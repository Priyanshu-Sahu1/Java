class Solution
{
    //Function to return the minimum cost of connecting the ropes.
   
    long minCost(long arr[], int n) 
    {
        // your code here
        long m=0;
        PriorityQueue<Long> pq=new PriorityQueue<Long>();
        for(int i=0;i<n;i++)
        {
            pq.add(arr[i]);
        }
        
        while(n!=1)
        {
           long min1=pq.poll();
           long min2=pq.poll();
           m=m+min1+min2;
           pq.add(min1+min2);
           n--;
            
        }
        return m;
        
    }
}