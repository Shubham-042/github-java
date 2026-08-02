package graphs.SDE;
import java.util.*;
public class cycleUndirectedBFS {
    class Pair{
        int node;
        int par;
        Pair(int node,int par){
            this.node=node;
            this.par=par;
        }
    }

    public boolean isCycle(int V, int[][] edges) {
        ArrayList<Integer>[] adj=new ArrayList[V];
        for(int i=0; i<V; i++){
            adj[i]=new ArrayList<>();
        }

        for(int[] e:edges){
            int u=e[0];
            int v=e[1];
            adj[u].add(v);
            adj[v].add(u);
        }
        boolean[] vis=new boolean[V];
        for(int i=0; i<V; i++){
            if(!vis[i]){
                Queue<Pair> q=new LinkedList<>();
                q.offer(new Pair(i,-1));
                vis[i]=true;

                while(q.size()>0){
                    Pair curr=q.poll();
                    int u=curr.node;
                    int par=curr.par;

                    for(int v:adj[u]){
                        if(!vis[v]){
                            vis[v]=true;
                            q.offer(new Pair(v,u));
                        }else if(v!=par){
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }
}
