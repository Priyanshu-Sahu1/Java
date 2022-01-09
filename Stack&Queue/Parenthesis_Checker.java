class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> s=new Stack<Character>();
        boolean flag=true;
        int top=-1;
        for(int i=0;i<x.length();i++)
        {
            if(x.charAt(i)=='(' || x.charAt(i)=='{' || x.charAt(i)=='[')
            {
                s.push(x.charAt(i));
                top++;
                continue;
            }
             else if(x.charAt(i)==')' && top!=-1)
            {
                //s.push(x.charAt(i));
                if(s.peek()=='(')
                {
                s.pop();
                top--;
                }
                 else{
                    flag=false;
                }
            }
           else if(x.charAt(i)=='}' && top!=-1 )
            {
                 if(s.peek()=='{')
               { s.pop();
                top--;}
                 else{
                    flag=false;
                }
            }
           else if(x.charAt(i)==']' && top!=-1)
             {
                 if(s.peek()=='[')
               { s.pop();
                top--;}
                else{
                    flag=false;
                }
            }
           
            else
            {
                flag=false;
                break;
            }
            
            
        }
        if(!s.empty())
        {
            flag=false;
        }
        return flag;
    }
}
