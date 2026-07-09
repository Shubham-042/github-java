package strings.SDESheet;
import java.util.*;
public class minInsertionToMakeStringPalindrome {
    private int helper(int i,int j,String s,int[][] dp){
        if(i>=j)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s.charAt(i)==s.charAt(j)){
            return dp[i][j]= helper(i+1,j-1,s,dp);
        }else{
            int  left=1+helper(i,j-1,s,dp);
            int right=1+helper(i+1,j,s,dp);
            return dp[i][j]= Math.min(left,right);
        }
    }
    public int minInsertions(String s) {
        int n=s.length();
        int[][] dp=new int[n][n];
        for(int[] row: dp){
            Arrays.fill(row,-1);
        }
        return helper(0,n-1,s,dp);
    }


    // method-2       s.length() - LCS
}
