package graphs.SDE;
import java.util.*;
public class topologicalSortBFS {
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
        Queue<Integer> q=new LinkedList<>();
        // calculate indegree of v
        int[] indeg=new int[V];
        for(int u=0; u<V; u++){
            for(int v:adj[u]){
                indeg[v]++;
            }
        }
        //check indegree and push to queue
        for(int i=0; i<V; i++){
            if(indeg[i]==0)q.offer(i);
        }

        //bfs
        while(q.size()>0){
            int curr=q.poll();
            ans.add(curr);
            for(int v:adj[curr]){
                indeg[v]--;
                if(indeg[v]==0)q.offer(v);
            }
        }

        return ans;
    }
}
