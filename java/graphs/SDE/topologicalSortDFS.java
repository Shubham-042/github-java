package graphs.SDE;
import java.util.*;
public class topologicalSortDFS {
    public void dfs(int curr,boolean[] vis,Stack<Integer> st,ArrayList<Integer>[] adj){
        vis[curr]=true;

        for(int v:adj[curr]){
            if(!vis[v]){
                vis[v]=true;
                dfs(v,vis,st,adj);
            }

        }
        st.push(curr);
    }
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        ArrayList<Integer>[] adj=new ArrayList[V];
        for(int i =0; i<V; i++){
            adj[i]=new ArrayList<>();
        }

        for(int[] e:edges){
            int u=e[0];
            int v=e[1];

            adj[u].add(v);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        boolean[] vis=new boolean[V];

        Stack<Integer> st=new Stack<>();

        for(int i=0; i<V; i++){
            if(!vis[i]){
                dfs(i,vis,st,adj);
            }
        }
        while(st.size()>0){
            ans.add(st.pop());
        }
        return ans;

    }
}
