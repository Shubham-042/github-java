package graphs.SDE;
import java.util.*;
public class cycleDirectedDFS {
    public boolean dfs(int src,boolean[] vis,boolean[] recPath,ArrayList<Integer>[] adj){
        vis[src]=true;
        recPath[src]=true;

        for(int v:adj[src]){
            if(!vis[v]){
                if(dfs(v,vis,recPath,adj))return true;

            }else if(recPath[v])return true;
        }
        recPath[src]=false;
        return false;
    }
    public boolean isCyclic(int V, int[][] edges) {
        ArrayList<Integer>[] adj=new ArrayList[V];
        for(int i=0; i<V; i++){
            adj[i]=new ArrayList<>();
        }

        for(int[] e:edges){
            int u=e[0];
            int v=e[1];
            adj[u].add(v);
        }


        boolean[] vis=new boolean[V];
        boolean[] recPath=new boolean[V];

        for(int i=0 ;i<V; i++){
            if(!vis[i]){
                if(dfs(i,vis,recPath,adj))return true;
            }
        }
        return false;

    }
}
