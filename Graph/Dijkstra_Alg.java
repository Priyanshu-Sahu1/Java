 public static class Pair implements Comparable<Pair>{
        int v;
        int wsf;
        Pair(int v,int wsf)
        {
            this.v=v;
            this.wsf=wsf;
        }
        public int compareTo(Pair o)
        {
            return this.wsf-o.wsf;
        }
    }
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        // Write your code here
        int array[]=new int[V];
       // int m=0;
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        pq.add(new Pair(S,0));
        boolean visited[]=new boolean[V];
        while(pq.size()>0)
        {
          Pair rem=pq.remove();
          if(visited[rem.v]==true)
          {
              continue;
          }
          visited[rem.v]=true;
          array[rem.v]=rem.wsf;
         // m++;
          for(ArrayList<Integer> u:adj.get(rem.v))
          {
              if(visited[u.get(0)]==false)
              {
                  pq.add(new Pair(u.get(0),rem.wsf+u.get(1)));
              }
          }
        }
        return array;
        
    }
}
