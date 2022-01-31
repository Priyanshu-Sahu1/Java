class Solution{
    static void wordb(String s,String ans,List<String> dict,ArrayList<String> as)
    {
        if(s.length()==0)
        {
             ans= ans.substring(0, ans.length() - 1);
            as.add(ans);
            return;
        }
        for(int i=0;i<s.length();i++)
        {
            String left=s.substring(0,i+1);
            if(dict.contains(left))
            {
                String right=s.substring(i+1);
                wordb(right,ans+left+" ",dict,as);
            }
        }
        
    }
    static List<String> wordBreak(int n, List<String> dict, String s)
    {
        // code here
        ArrayList<String> as=new ArrayList<String>();
       
        wordb(s,"",dict,as);
        return as;
        
    }
}
