package graphs.SDE;
import java.util.*;
public class DFS {
    private void dfs(ArrayList<ArrayList<Integer>> adj,int u,boolean[] vis,ArrayList<Integer> ans){

        ans.add(u);
        vis[u]=true;
        for(int i=0; i<adj.get(u).size(); i++){
            int v=adj.get(u).get(i);
            if(!vis[v]){
                dfs(adj,v,vis,ans);
            }
        }
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> ans=new ArrayList<>();
        int v=adj.size();
        boolean[] vis=new boolean[v];
        dfs(adj,0,vis,ans);
        return ans;
    }
}
