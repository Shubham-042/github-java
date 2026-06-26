package DP.dpOn2D;
import java.util.*;
public class uniquePath {
    public int ways(int sr,int sc,int er,int ec,int[][] dp){
        if(sr>er)return 0;
        if(sc>ec)return 0;
        if(sr==er && sc==ec)return 1;
        if(dp[sr][sc]!=-1)return dp[sr][sc];
        int downways=ways(sr+1,sc,er,ec,dp);
        int rightways=ways(sr,sc+1,er,ec,dp);
        return dp[sr][sc]=downways+rightways;
    }
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int[] row:dp)Arrays.fill(row,-1);
        return ways(0,0,m-1,n-1,dp);
    }


    public int uniquePathsSpaceOptimise(int m, int n) {
        int[][] dp=new int[2][n];
        for(int j=0; j<n; j++){
            dp[0][j]=1;
            dp[1][j]=1;
        }
        for(int i=1; i<=m-1; i++){
            //dp wala kaam
            for(int j=1; j<n; j++){
                dp[1][j]=dp[1][j-1]+dp[0][j];
            }
            //copy 1th row to 0th row
            for(int j=1; j<n; j++){
                dp[0][j]=dp[1][j];
            }
        }
        return dp[1][n-1];
    }
}
