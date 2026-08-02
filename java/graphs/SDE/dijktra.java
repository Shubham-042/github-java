package graphs.SDE;
import java.util.*;
public class dijktra {
    class Pair{
        int node;
        int wt;
        Pair(int node,int wt){
            this.node=node;
            this.wt=wt;
        }
    }
    class Pair2 implements Comparable<Pair2>{
        int dist;
        int node;
        Pair2(int dist,int node){
            this.dist=dist;
            this.node=node;
        }
        public int compareTo(Pair2 p){
            return this.dist-p.dist;
        }

    }
    public int[] dijkstra(int V, int[][] edges, int src) {
        ArrayList<Pair>[] adj=new ArrayList[V];

        for(int i=0; i<V; i++){
            adj[i]=new ArrayList<>();
        }

        for(int[] row:edges){
            int u=row[0];
            int v=row[1];
            int wt=row[2];

            adj[u].add(new Pair(v,wt));
            adj[v].add(new Pair(u,wt));

        }
        PriorityQueue<Pair2> pq=new PriorityQueue<>();
        int[] dist=new int[V];
        boolean[] vis=new boolean[V];
        for(int i=0; i<V; i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }

        pq.add(new Pair2(0,src));
        while(pq.size()>0){
            Pair2 curr=pq.poll();

            int u=curr.node;
            if(!vis[u]){
                vis[u]=true;
                for(Pair p:adj[u]){
                    int v=p.node;
                    int wt=p.wt;
                    if(dist[u]+wt<dist[v]){
                        dist[v]=dist[u]+wt;
                        pq.offer(new Pair2(dist[v],v));
                    }
                }
            }
        }

        return dist;
    }
}
