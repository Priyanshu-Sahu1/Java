class Solution {

    public static long maximizeSum(long a[], int n, int k)
    {
        // Your code goes here
           Arrays.sort(a);
         for(int i=0;i<n;i++)
         {
             if(a[i]<0 && k>0)
             {
                 a[i]=a[i]*-1;
                 k--;
             }
         }
         if(k>0)
         {
             Arrays.sort(a);
             while(k!=0)
             {
                 a[0]=a[0]*-1;
                 k--;
             }
         }
         long max=0;
         for(int i=0;i<n;i++)
         {
             max+=a[i];
         }
         return max;
    }
}
