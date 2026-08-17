package DP.dpOnStrings;

import java.util.Arrays;

public class longestCommonSubstring {
    public static int lcSubString(String s1,String s2){
        int m=s1.length();
        int n=s2.length();
        int[][] dp=new int[m+1][n+1];
        int max=0;
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=0;
                }
                max=Math.max(max,dp[i][j]);
            }


        }
        return max;
    }


    // recursion
    public static int lcsRec(String s1,String s2){
        int n=s1.length();
        int m=s2.length();

        return solve(s1,s2,n-1,m-1,0);
    }
    public static int solve(String s1,String s2,int i,int j,int count){
        if(i<0 || j<0)return count;

        int curr=count;

        if(s1.charAt(i)==s2.charAt(j)){
            return solve(s1,s2,i-1,j-1,count+1);
        }
        int x=solve(s1,s2,i-1,j,count);
        int y=solve(s1,s2,i,j-1,count);

        return  Math.max(curr,Math.max(x,y));
    }
    public static void main(String[] args) {
        String s1="abcde";
        String s2="abcd";
        int m=s1.length();
        int n=s2.length();

        System.out.println(lcsRec(s1,s2));
    }
}
