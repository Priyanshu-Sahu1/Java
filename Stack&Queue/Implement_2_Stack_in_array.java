class Stacks
{
    //Function to push an integer into the stack1.
    
    
    void push1(int x, TwoStack sq)
    {
        sq.top1++;
        //top1++;
        if(sq.top1==sq.top2)
        return;
       sq.arr[sq.top1]=x;
        //top1++;
        
    }

    //Function to push an integer into the stack2.
    void push2(int x, TwoStack sq)
    {
//top2++;
sq.top2--;
if(sq.top1==sq.top2)
return;
sq.arr[sq.top2]=x;
    }

    //Function to remove an element from top of the stack1.
    int pop1(TwoStack sq)
    {
      //  int m=arr[top1];
      if(sq.top1<0)
      {
          return -1;
      }
      
        int r=sq.arr[sq.top1];
        sq.arr[sq.top1]=0;
        sq.top1--;
        return r;
        //return m;
    }

    //Function to remove an element from top of the stack2.
    int pop2(TwoStack sq)
    {
         //int n=arr[top2];
         if(sq.top2==sq.size)
         {
             return -1;
         }
         int r=sq.arr[sq.top2];
         sq.arr[sq.top2]=0;
         sq.top2++;
         //return n;
         return r;
        
    }
}

