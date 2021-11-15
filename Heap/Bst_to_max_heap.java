class Solution
{
//int i=0;
    static void inorder(Node root,Queue<Integer> q)
    {
        if(root==null)
        return ;
        inorder(root.left,q);
        q.add(root.data);
        inorder(root.right,q);
    
    }
    static void postview(Node temp,Queue<Integer> q)
    {
        if(temp==null)
        return;
        postview(temp.left,q);
        postview(temp.right,q);
        temp.data=q.poll();
       
    }
    public static void convertToMaxHeapUtil(Node root)
    {
        
     Node temp=root;
        
        Queue<Integer> q=new LinkedList<>();
    inorder(root,q);

  postview(temp,q);  
        
    }
}