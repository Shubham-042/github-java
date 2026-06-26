package DP.dpOn2D;
import java.util.*;

public class minPathSum {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        dp[0][0]=grid[0][0];
        for(int i=1; i<m; i++){
            dp[i][0]=grid[i][0]+dp[i-1][0];
        }
        for(int j=1; j<n; j++){
            dp[0][j]=grid[0][j]+dp[0][j-1];
        }
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                dp[i][j]=grid[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m-1][n-1];
    }
    // memoziation
    public int minPathSumMemo(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        // initialize with -1 (means not computed)
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return helper(m - 1, n - 1, grid, dp);
    }

    private int helper(int i, int j, int[][] grid, int[][] dp) {

        // base case
        if (i == 0 && j == 0) {
            return grid[0][0];
        }

        // out of bounds
        if (i < 0 || j < 0) {
            return Integer.MAX_VALUE;
        }

        // memoization check
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int up = helper(i - 1, j, grid, dp);
        int left = helper(i, j - 1, grid, dp);

        dp[i][j] = grid[i][j] + Math.min(up, left);

        return dp[i][j];
    }
}
