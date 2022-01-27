class GFG
{
    long maxSum(long arr[] ,int n)
    {
    Arrays.sort(arr);
    int i=0;
    int j=n-1;
    long sum=0;
    int ptr=0;
    while(i<j)
    {
        sum+=Math.abs(arr[i]-arr[j]);
        if(ptr==0)
        {
            i++;
            ptr++;
        }
        else
        {
            j--;
            ptr--;
        }
    }
    sum+=Math.abs(arr[n/2]-arr[0]);
    return sum;
     }
}
