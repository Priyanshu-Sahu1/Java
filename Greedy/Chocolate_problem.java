class Solution
{
    public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        // your code here
        
        int N=(int)n;
        int M=(int)m;
       Collections.sort(a);
       long min=Integer.MAX_VALUE;
        for(int i=0;i<N;i++)
        {
            if(N-i>=M)
            {
            long b=a.get(i);
            long c=a.get(i+M-1);
            long minmax=c-b;
            if(minmax<min)
            {
                min=minmax;
            }
            
            }
            else
            {
                
            }
        }
        return min;
    }
}
