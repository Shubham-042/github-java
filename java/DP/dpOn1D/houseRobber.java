package DP.dpOn1D;
import java.util.*;

public class houseRobber {
    //dp memoization
    public static int amount(int[] nums, int i,int[] dp){
        if(i>=nums.length)return 0;
        if(dp[i]!=-1)return dp[i];
        int take=nums[i]+amount(nums,i+2,dp);
        int skip=amount(nums,i+1,dp);
        return dp[i]=Math.max(take,skip);
    }
    public static int rob(int[] nums){
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return amount(nums,0,dp);
    }


    //dp tabulation
    public static int rob2(int[] nums) {
        int n=nums.length;
        // dp tabulation
        if(n==1)return nums[0];
        int[] dp=new int[n];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2; i<n; i++){
            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        return dp[n-1];
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        System.out.println(rob(nums));
    }
}
