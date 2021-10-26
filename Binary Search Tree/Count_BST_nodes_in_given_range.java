
class Tree
{
    //Function to count number of nodes in BST that lie in the given range.
    void inorder(Node root,int l,int h,ArrayList<Integer> as)
    {
        if(root==null)
        return ;
        inorder(root.left,l,h,as);
        if(root.data>=l  && root.data<=h)
        {
            as.add(root.data);
        }
        inorder(root.right,l,h,as);
    }
    int getCount(Node root,int l, int h)
    {
        //Your code here
        ArrayList<Integer> as=new ArrayList<Integer>();
        inorder(root,l,h,as);
        
        int c=as.size();
        return c;
        
    }
}
