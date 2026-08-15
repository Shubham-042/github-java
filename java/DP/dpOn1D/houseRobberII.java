package DP.dpOn1D;
import java.util.*;
public class houseRobberII {
    private int amount(int[] nums,int i,int end,int[] dp){
        int n=nums.length;
        if(i>end)return 0;
        if(dp[i]!=-1)return dp[i];

        int take=nums[i]+amount(nums,i+2,end,dp);
        int skip=amount(nums,i+1,end,dp);
        return dp[i]=Math.max(take,skip);

    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        int[] dp1=new int[n];
        int[] dp2=new int[n];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        int case1=amount(nums,0,n-2,dp1); //exclude last
        int case2=amount(nums,1,n-1,dp2); //exclude first
        return Math.max(case1,case2);
    }



    // space optimise
    public int solveSpace(int[] nums,int st,int end){
        int prev2=0;
        int prev1=0;
        for(int i=st; i<=end; i++){
            int take=nums[i]+prev2;
            int skip=prev1;

            int curr=Math.max(take,skip);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
    public int robSpace(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        return Math.max(solveSpace(nums,0,n-2),solveSpace(nums,1,n-1));
    }
}
