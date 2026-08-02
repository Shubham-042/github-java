package graphs.SDE;
import java.util.*;
public class SCCkosaRaju {
    public void topo(int curr,boolean[] vis,Stack<Integer> st,ArrayList<Integer>[] adj){
        vis[curr]=true;
        for(int v:adj[curr]){
            if(!vis[v]){
                topo(v,vis,st,adj);
            }
        }
        st.push(curr);
    }

    public void dfs(int curr,boolean[] vis,ArrayList<Integer>[] transpose){
        vis[curr]=true;
        for(int v:transpose[curr]){
            if(!vis[v]){
                dfs(v,vis,transpose);
            }
        }
    }

    //main function
    public int kosaraju(int V, int[][] edges) {
        int count=0;
        ArrayList<Integer>[] adj=new ArrayList[V];
        for(int i=0; i<V; i++){
            adj[i]=new ArrayList<>();
        }

        for(int[] e:edges){
            int u=e[0];
            int v=e[1];

            adj[u].add(v);
        }



        Stack<Integer> st=new Stack<>();
        boolean[] vis=new boolean[V];
        // get nodes in stack in topological order
        for(int i=0; i<V; i++){
            if(!vis[i]){
                topo(i,vis,st,adj);
            }
        }

        //transpose graph
        ArrayList<Integer>[] transpose=new ArrayList[V];
        for(int i=0; i<V; i++){
            vis[i]=false;
            transpose[i]=new ArrayList<>();
        }

        for(int[] e:edges){
            int u=e[0];
            int v=e[1];

            transpose[v].add(u);
        }

        //dfs according to stack
        while(st.size()>0){
            int curr=st.pop();
            if(!vis[curr]){
                dfs(curr,vis,transpose);
                count++;
            }
        }


        return count;

    }
}
