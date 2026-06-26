package DP;
import java.util.*;

public class uniqueBST {
    // tabulation
    public int numTrees(int n) {
        int[] dp=new int[n+1];
        dp[0]=dp[1]=1;
        // i -> no. of node
        for(int i=2; i<=n; i++){
            // j-> root node
            for(int j=1; j<=i; j++){
                dp[i]+=dp[j-1]*dp[i-j];
            }
        }
        return dp[n];
    }

    // memoization
    public int solve(int n,int[] dp){
        if(n<=1)return 1;
        if(dp[n]!=-1)return dp[n];
        int ans=0;
        for(int i=1; i<=n; i++){
            ans+=solve(i-1,dp)*solve(n-i,dp);
        }
        return dp[n]= ans;
    }
    public int numTreesMemo(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,dp);
    }
}
