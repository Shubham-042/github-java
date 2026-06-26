package DP.dpOnStrings;
import java.util.*;
public class lcs {
    public static int LCS(int i,int j,String s1,String s2,int[][] dp){
        if(i<0 || j<0)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)) return dp[i][j]= 1+LCS(i-1,j-1,s1,s2,dp);
        else{
            return dp[i][j]= Math.max(LCS(i,j-1,s1,s2,dp),LCS(i-1,j,s1,s2,dp));
        }
    }
    public static int lcsTab(String s1,String s2){
        int m=s1.length();
        int n=s2.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }


        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        String s1="abcde";
        String s2="abcd";
        int m=s1.length();
        int n=s2.length();
        int[][] dp=new int[m][n];
        for(int[] row:dp)Arrays.fill(row,-1);
        System.out.println(lcsTab(s1,s2));
    }
}
