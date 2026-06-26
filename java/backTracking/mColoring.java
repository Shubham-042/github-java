package backTracking;

public class mColoring {
    boolean isSafe(int[][] edges,int[] color,int node,int col){
        for(int i=0; i<edges.length; i++){
            int u=edges[i][0];
            int v=edges[i][1];

            if(u==node && color[v]==col)return false;
            if(v==node && color[u]==col)return false;


        }
        return true;
    }
    boolean solve(int[][] edges,int[] color,int node,int v,int m){
        if(node==v)return true;

        for(int i=1; i<=m; i++ ){
            if(isSafe(edges,color,node,i)){
                color[node]=i;
                if(solve(edges,color,node+1,v,m))return true;
                color[node]=0;
            }
        }
        return false;
    }
    boolean graphColoring(int v, int[][] edges, int m) {
        // code here
        int[] color=new int[v];
        return solve(edges,color,0,v,m);
    }
}
