package graphs.SDE;
import java.util.*;
public class cycleUndirectedDFS {
    public boolean dfs(int src,int par,boolean[] vis,ArrayList<Integer>[] adj){
        vis[src]=true;
        for(int v:adj[src]){

            if(!vis[v]){
                if(dfs(v,src,vis,adj))return true;
            }else{
                if(v!=par)return true;
            }
        }
        return false;
    }
    public boolean isCycle(int V, int[][] edges) {

        ArrayList<Integer>[] adj = new ArrayList[V];

        for (int i = 0; i < V; i++)
            adj[i] = new ArrayList<>();

        for (int[] e : edges) {
            adj[e[0]].add(e[1]);
            adj[e[1]].add(e[0]);
        }
        boolean[] vis=new boolean[V];


        for(int i=0 ;i<V; i++){ // for connected components
            if(!vis[i]){
                if(dfs(i,-1,vis,adj))return true;
            }
        }
        return false;
    }
}
