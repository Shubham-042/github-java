package DP;
import java.util.*;
public class rodcutting {
//    public static int rodCutting(int i,int n,int[] price,int[][] dp){
//        if(i<0)return 0;
//        if(dp[i][n]!=-1)return dp[i][n];
//        int notTake=rodCutting(i-1,n,price,dp);
//        int take=Integer.MIN_VALUE;
//        int rodLen=i+1; // 0 based index
//        if(rodLen<=n){
//            take=price[i]+rodCutting(i,n-rodLen,price,dp);
//        }
//        return dp[i][n]= Math.max(take,notTake);
//    }
//
//    public static void main(String[] args) {
//        int[] price={1,5,8,9,10,17,17,20};
//        int[][] dp=new int[8][9]; // n,n+1
//        for(int[] row:dp)Arrays.fill(row,-1);
//        System.out.println(rodCutting(7,8,price,dp));
//    }

    //tabulation
//    public static void main(String[] args) {
//        int[] price={1,5,8,9,10,17,17,20};
//        int n=8;
//        int[][] dp=new int[n][n+1];
//        //base case
//        for(int len=0; len<=n; len++){
//            dp[0][len]=len*price[0];
//        }
//        //fill table
//        for(int i=1; i<n; i++){
//            for(int len=0; len<=n; len++){
//                int notTake=dp[i-1][len];
//                int take=Integer.MIN_VALUE;
//                int rodLen=i+1; // 0 based index
//                if(rodLen<=len){
//                  take=price[i]+dp[i][len-rodLen];
//                }
//                dp[i][len]=Math.max(take,notTake);
//            }
//        }
//        System.out.println(dp[n-1][n]);
//    }


    // space optimisation

        public static void main(String[] args) {
            int[] price = {1,5,8,9,10,17,17,20};
            int n = price.length;

            int[] dp = new int[n + 1];

            for (int len = 1; len <= n; len++) {
                for (int i = 0; i < n; i++) {
                    int rodLen = i + 1;
                    if (rodLen <= len) {
                        dp[len] = Math.max(dp[len], price[i] + dp[len - rodLen]);
                    }
                }
            }

            System.out.println(dp[n]);
        }
    }

