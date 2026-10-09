package DP.dpOn2D;
import java.util.*;
public class incresingPathInGrid {
    int MOD=1_000_000_007;
    int[][] dir={
            {-1,0},
            {0,-1},     {0,1},
            {1,0}
    };
    public boolean isSafe(int i,int j,int[][] grid){
        return (i<grid.length && j<grid[0].length && i>=0 && j>=0);
    }
    public int dfs(int[][] grid,int i,int j,int[][] dp){
        if(dp[i][j]!=-1)return dp[i][j];
        int ans=1;
        for(int[] row:dir){
            int newi=i+row[0];
            int newj=j+row[1];
            if(isSafe(newi,newj,grid) &&  grid[newi][newj]<grid[i][j]){
                ans=(ans+dfs(grid,newi,newj,dp))%MOD;
            }
        }
        return dp[i][j]= ans%MOD;
    }
    public int countPaths(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] dp=new int[n+1][m+1];
        for(int[] row:dp)Arrays.fill(row,-1);
        int count=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                count=(count+dfs(grid,i,j,dp))%MOD;
            }
        }
        return count%MOD;
    }
}
