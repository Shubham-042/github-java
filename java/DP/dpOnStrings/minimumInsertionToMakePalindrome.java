package DP.dpOnStrings;
import java.util.*;
public class minimumInsertionToMakePalindrome {
    private int helper(int i,int j,String s,int[][] dp){
        if(i>j)return 0;
        if(i==j)return 1;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s.charAt(i)==s.charAt(j)){
            return dp[i][j]= 2+helper(i+1,j-1,s,dp);
        }else{
            return dp[i][j]= Math.max(helper(i+1,j,s,dp),helper(i,j-1,s,dp));
        }
    }
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        int[][] dp=new int[n][n];
        for(int[] row:dp)Arrays.fill(row,-1);
        return helper(0,n-1,s,dp);
    }
    public int minInsertions(String s) {
        return s.length()-longestPalindromeSubseq(s);
    }
}
