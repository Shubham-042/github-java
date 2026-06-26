package DP.dpOn2D;
import java.util.*;
public class editdistance {
    private int helper(String s1,String s2,int i,int j,int[][] dp){
        if(i<0) return j+1;
        if(j<0)return i+1;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]= helper(s1,s2,i-1,j-1,dp);
        }else{
            int insert=1+helper(s1,s2,i,j-1,dp);
            int delete=1+helper(s1,s2,i-1,j,dp);
            int replace=1+helper(s1,s2,i-1,j-1,dp);
            return dp[i][j]= Math.min(insert,Math.min(delete,replace));
        }
    }
    public int minDistance(String s1, String s2) {
        int m=s1.length();
        int n=s2.length();
        int[][] dp=new int[m][n];
        for(int[] row:dp)Arrays.fill(row,-1);
        return helper(s1,s2,m-1,n-1,dp);
    }
}
