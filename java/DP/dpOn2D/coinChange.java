package DP.dpOn2D;
import java.util.*;

public class coinChange {
    private static long solve(int i,int[] coins,int amt,long[][] dp){
        if(i==coins.length){
            if(amt==0)return 0;
            else return Integer.MAX_VALUE;
        }
        if(dp[i][amt]!=-1)return dp[i][amt];
        //skip
        long skip=solve(i+1,coins,amt,dp);
        if(amt-coins[i]<0)return dp[i][amt]= skip;
        long  pick=1+solve(i,coins,amt-coins[i],dp);
        return dp[i][amt]=Math.min(skip,pick);
    }
    public static int  coinChange(int[] coins, int amt) {
        int n=coins.length;
        // i change i to n-1 and amount -> amount to 0 included
        long[][] dp=new long[n][amt+1];
        for(long[] row:dp)Arrays.fill(row,-1);
        int ans=(int)solve(0,coins,amt,dp);
        return ans==Integer.MAX_VALUE ? -1:ans;
    }


    public static void main(String[] args) {
        int[] coins={1,2,5};
        int amt=11;
        System.out.println(coinChange(coins,amt));
    }
}
