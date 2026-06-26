package DP.dpOnStrings;
import java.util.*;

public class deletionOperationTwoStrings {
    private int helper(String s1,String s2,int i,int j, int[][] dp){
        if(i==s1.length() || j==s2.length())return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]= 1+helper(s1,s2,i+1,j+1,dp);
        }else{
            return dp[i][j]= Math.max(helper(s1,s2,i+1,j,dp),helper(s1,s2,i,j+1,dp));
        }
    }
    public int longestCommonSubsequence(String s1, String s2) {
        int m=s1.length();
        int n=s2.length();
        int[][] dp=new int[m][n];
        for(int[] row:dp)Arrays.fill(row,-1);
        return helper(s1,s2,0,0,dp);
    }
    public int minDistance(String s1, String s2) {
        return s1.length()+s2.length()-2*longestCommonSubsequence(s1,s2);
    }
}
