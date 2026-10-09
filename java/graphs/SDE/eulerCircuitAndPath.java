package graphs.SDE;
import java.util.*;
public class eulerCircuitAndPath {
    public void dfs(int u, ArrayList<Integer>[] adj, boolean[] vis) {
        vis[u] = true;

        for (int v : adj[u]) {
            if (!vis[v]) {
                dfs(v, adj, vis);
            }
        }
    }

    private boolean isConnected(int V, ArrayList<Integer>[] adj) {

        int nonZeroVertex = -1;

        for (int i = 0; i < V; i++) {
            if (adj[i].size() > 0) {
                nonZeroVertex = i;
                break;
            }
        }

        if (nonZeroVertex == -1)
            return true;

        boolean[] vis = new boolean[V];

        dfs(nonZeroVertex, adj, vis);

        for (int i = 0; i < V; i++) {
            if (adj[i].size() > 0 && !vis[i])
                return false;
        }

        return true;
    }

    public int isEulerCircuit(int V, ArrayList<Integer>[] adj) {

        if (!isConnected(V, adj))
            return 0;

        int oddDegree = 0;

        for (int i = 0; i < V; i++) {
            if (adj[i].size() % 2 != 0)
                oddDegree++;
        }

        if (oddDegree == 0)
            return 2;

        if (oddDegree == 2)
            return 1;

        return 0;
    }
}
