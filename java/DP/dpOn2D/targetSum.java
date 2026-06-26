package DP.dpOn2D;
import java.util.*;
public class targetSum {
    static int sum;
    private int ways(int i,int[] nums,int res,int target,int[][] dp){
        if(i==nums.length){
            if(res==target)return 1; // 1 valid ways
            else return 0;
        }
        if(dp[i][res+sum]!=-1)return dp[i][res+sum];
        int add=ways(i+1,nums,res-nums[i],target,dp);
        int sub=ways(i+1,nums,res+nums[i], target,dp);
        return dp[i][res+sum]= add+sub;
    }
    public int findTargetSumWays(int[] nums, int target) {
        sum=0;
        int n=nums.length;
        for(int num:nums)sum+=num;
        int[][] dp=new int[n][2*sum+1];
        for(int[] row:dp)Arrays.fill(row,-1);
        return ways(0,nums,0,target,dp);
    }
}
