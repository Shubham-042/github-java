package DP.dpOn2D;

import java.util.Arrays;

public class tabulationKnapsack {
//    public static int profit(int i,int[] wt,int[] val,int C,int[][] dp){
//        if(i<0)return 0;
//        if(dp[i][C]!=-1)return dp[i][C];
//        int skip=profit(i-1,wt,val,C,dp);
//        if(wt[i]>C) return dp[i][C]= skip;
//        int pick=val[i]+profit(i-1,wt,val,C-wt[i],dp);
//        return dp[i][C]= Math.max(pick,skip);
//    }
    public static void main(String[] args) {
        int[] val={5,3,7,16};
        int[] wt={1,2,8,10};
        int C=8;
        int n=wt.length;
        int[][] dp=new int[n][C+1];
        for(int i=0; i<n; i++){
            for(int j=0; j<C+1; j++){
                int skip=(i>0)? dp[i-1][j]:0;
                if(wt[i]>j)  dp[i][j]= skip;
                else{
                    int pick=val[i];
                    pick+=(i>0)? dp[i-1][j-wt[i]] :0;
                    dp[i][j]= Math.max(pick,skip);
                }
            }
        }
        System.out.println(dp[n-1][C]);

    }
}
