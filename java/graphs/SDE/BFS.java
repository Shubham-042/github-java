package graphs.SDE;
import java.util.*;
public class BFS {

    private void bfs(ArrayList<ArrayList<Integer>> adj,int v,ArrayList<Integer> ans){
        Queue<Integer> q=new LinkedList<>();
        boolean[] vis=new boolean[v];

        q.offer(0);
        while(q.size()>0){
            int curr=q.poll();

            if(!vis[curr]){
                ans.add(curr);
                vis[curr]=true;
                for(int i=0; i<adj.get(curr).size(); i++){
                    int e=adj.get(curr).get(i);
                    q.offer(e);
                }
            }
        }
    }
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans=new ArrayList<>();
        int v=adj.size();
        bfs(adj,v,ans);
        return ans;

    }
}
