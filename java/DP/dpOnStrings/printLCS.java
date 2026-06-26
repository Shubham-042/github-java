package DP.dpOnStrings;

import java.util.Arrays;

public class printLCS {
    public static int lcs(String s1,String s2){
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
        StringBuilder ans=new StringBuilder("");
        int i=m;
        int j=n;
        while(i>0 && j>0){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                ans.append(s1.charAt(i-1));
                i--;
                j--;
            }
            else if(dp[i-1][j]>dp[i][j-1]){
                i--;
            }else j--;

        }
        ans.reverse();
        System.out.println(ans);
        return dp[m][n];
    }
    public static void main(String[] args) {
        String s1="abcde";
        String s2="abcd";
        int m=s1.length();
        int n=s2.length();


        System.out.println(lcs(s1,s2));
    }
}
