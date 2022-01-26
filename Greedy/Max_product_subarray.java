class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) 
    {
        // code here
        
    long max=arr[0];
    long m=1;
        for(int i=0;i<n;i++)
        {
            
            m*=arr[i];
            if(m>max)
            {
                max=m;
            }
            if(arr[i]==0)
            {
                m=1;
                
            }
        }
        m=1;
         for(int i=n-1;i>=0;i--)
        {
            
            m*=arr[i];
            if(m>max)
            {
                max=m;
            }
            if(arr[i]==0)
            {
                m=1;
                //continue;
            }
        }
        return max;
    }
}
