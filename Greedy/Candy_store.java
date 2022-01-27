class Solution{
    static ArrayList<Integer> candyStore(int candies[],int N,int K){
        // code here
        ArrayList<Integer> as=new ArrayList<Integer>();
        int m=N;
        int min=0;
        int max=0;
        Arrays.sort(candies);
        for(int i=0;i<m;i++)
        {
            min+=candies[i];
            m-=K;
        }
        int q=0;
         for(int i=N-1;i>=q;i--)
        {
            max+=candies[i];
            q+=K;
        }
        as.add(min);
        as.add(max);
        return as;
    }
}
