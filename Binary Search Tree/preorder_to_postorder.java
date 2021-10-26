

static Node check(Node root,int x)
{
    if(root==null)
    return new Node(x);
    if(root.data>x)
    root.left=check(root.left,x);
    if(root.data<x)
    root.right=check(root.right,x);
    return root;
}
public static Node post_order(int pre[], int size) 
{
    //Your code here
    Node root=null;
   for(int i=0;i<size;i++)
   {
      root=check(root,pre[i]); 
   }

    return root;
} 

