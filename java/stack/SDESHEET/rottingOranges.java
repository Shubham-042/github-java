package stack.SDESHEET;
import java.util.*;
public class rottingOranges {
    class Triplet{
        int i;
        int j;
        int t;
        Triplet(int i,int j,int t){
            this.i=i;
            this.j=j;
            this.t=t;
        }
    }
    public int orangesRotting(int[][] grid) {
        Queue<Triplet> q=new LinkedList<>();
        int n=grid.length;
        int m=grid[0].length;
        int max=0;
        boolean[][] vis=new boolean[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j]==2) q.offer(new Triplet(i,j,0));
            }
        }

        while(q.size()>0){
            Triplet top=q.poll();
            int i=top.i; int j=top.j; int t=top.t;
            max=Math.max(max,t);

            //up
            if(i-1>=0 && !vis[i-1][j] && grid[i-1][j]==1){
                q.offer(new Triplet(i-1,j,t+1));
                vis[i-1][j]=true;
            }

            //down
            if(i+1<n && !vis[i+1][j] && grid[i+1][j]==1){
                q.offer(new Triplet(i+1,j,t+1));
                vis[i+1][j]=true;
            }

            //left
            if(j-1>=0 && !vis[i][j-1] && grid[i][j-1]==1){
                q.offer(new Triplet(i,j-1,t+1));
                vis[i][j-1]=true;
            }

            //right
            if(j+1<m && !vis[i][j+1] && grid[i][j+1]==1){
                q.offer(new Triplet(i,j+1,t+1));
                vis[i][j+1]=true;
            }

        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j]==1 && !vis[i][j])return -1;
            }
        }
        return max;
    }
}
