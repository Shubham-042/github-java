package DP;
import java.util.*;
public class stoneGameIII {
    public int solve(int i,int[] stone,int[] dp){
        if(i>=stone.length)return 0;
        if(dp[i]!=-1)return dp[i];
        int result=stone[i]-solve(i+1,stone,dp);
        if(i+1<stone.length)
            result=Math.max(result,stone[i]+stone[i+1]-solve(i+2,stone,dp));

        if(i+2<stone.length)
            result=Math.max(result,stone[i]+stone[i+1]+stone[i+2]-solve(i+3,stone,dp));


        return dp[i]= result;
    }
    public String stoneGameIII(int[] stone) {
        int[] dp=new int[stone.length+1];
        Arrays.fill(dp,-1);
        int result=solve(0,stone,dp);
        if(result>0)return "Alice";
        else if(result<0)return "Bob";
        else return "Tie";
    }
}
