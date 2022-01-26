class Solution{
    
    
    String chooseandswap(String A){
        // Code Here
       TreeSet<Character> s=new TreeSet<Character>();
       for(int i=0;i<A.length();i++)
       {
           s.add(A.charAt(i));
       }
       StringBuilder as=new StringBuilder();
       int flag=0;
       char f=A.charAt(0);
       for(int i=0;i<A.length();i++)
       {
           char ch2=A.charAt(i);
           s.remove(ch2);
           if(s.isEmpty())
             { 
                 break;
                 
             }
        for(char ch:s)
        {
            f=ch;
            break;
        }
           if(f<ch2)
           {
               flag=1;
               
               for(int j=0;j<A.length();j++)
               {
                   if(A.charAt(j)==f)
                   {
                    as.append(ch2);
                   }
                    else if(A.charAt(j)==ch2)
                    {
                    as.append(f);
                    }
                    else
                    {
                        as.append(A.charAt(j));
                    }
               }
           
               break;
           }
       }
       if(flag==0)
       {
           return A;
       }
       return as.toString();
    }
    
}
