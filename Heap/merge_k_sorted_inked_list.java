class Solution
{
    //Function to merge K sorted linked list.
    public static class pair implements Comparable<pair> {
		int llname;
		Node node;

		pair(int l, Node n) {
			this.llname = l;
			this.node = n;
		}

	//	@Override
		public int compareTo(pair o) {
			return this.node.data - o.node.data;
		}
	}
    
    Node mergeKList(Node[]arr,int K)
    {
        //Add your code here.\
        
        Node temp=null; 
        Node head=null;
         // Write your code here.
        PriorityQueue<pair> pq=new PriorityQueue<pair>();
        //ArrayList<Integer> as=new ArrayList<Integer>();
        for(int i=0;i<K;i++)
        {
            
                pq.add(new pair (i,arr[i]));
                //temp=temp.next;
                
            
        }
        pair rv=pq.remove();
        head=rv.node;
        temp=head;
        if(rv.node.next!=null)
        {
            pq.add(new pair(rv.llname, rv.node.next));
        }
        while(!pq.isEmpty())
        {
            
            pair popped=pq.poll();
            temp.next=popped.node;
            temp=temp.next;
            
             if(popped.node.next!=null)
        {
            pq.add(new pair(popped.llname, popped.node.next));
        }
        }
        
        return head;
    }
}
