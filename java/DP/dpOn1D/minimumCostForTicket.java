package DP.dpOn1D;
import java.util.*;
public class minimumCostForTicket {
    // memoization
    private int solve(int n,int[] days,int[] cost,int idx,int[] dp){
        if(idx>=n)return 0;
        if(dp[idx]!=-1)return dp[idx];
        // 1 day pass
        int opt1=cost[0]+solve(n,days,cost,idx+1,dp);

        //7 day pass
        int i=idx;
        while(i<n && days[i]<days[idx]+7)i++;
        int opt2=cost[1]+solve(n,days,cost,i,dp);

        //30 day pass
        i=idx;
        while(i<n && days[i]<days[idx]+30)i++;
        int opt3=cost[2]+solve(n,days,cost,i,dp);

        return dp[idx]= Math.min(opt1,Math.min(opt2,opt3));
    }
    public int mincostTickets(int[] days, int[] costs) {
        int n=days.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,days,costs,0,dp);
    }
    public int solveTab(int n,int[] days,int[] cost){
        int[] dp=new int[n+1];
        dp[n]=0;
        for(int k=n-1; k>=0; k--){
            // 1 day pass
            int opt1=cost[0]+dp[k+1];

            //7 day pass
            int i=k;
            while(i<n && days[i]<days[k]+7)i++;
            int opt2=cost[1]+dp[k];

            //30 day pass
            i=k;
            while(i<n && days[i]<days[k]+30)i++;
            int opt3=cost[2]+dp[k];

            return dp[k]= Math.min(opt1,Math.min(opt2,opt3));
        }
        return dp[0];
    }
}
