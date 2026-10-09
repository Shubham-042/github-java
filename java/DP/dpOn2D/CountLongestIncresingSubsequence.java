package DP.dpOn2D;

public class CountLongestIncresingSubsequence {
    public int findNumberOfLIS(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        int[] count=new int[n];
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            dp[i]=1;
            count[i]=1;
            for(int j=i-1; j>=0; j--){
                if(nums[j]<nums[i]){
                    if(dp[j]+1==dp[i]){
                        count[i]+=count[j];
                    }else if(dp[j]+1 > dp[i]){
                        dp[i]=dp[j]+1;
                        count[i]=count[j];
                    }
                }

            }
            max=Math.max(dp[i],max);


        }
        int res=0;

        for(int i=0; i<n; i++){
            if(dp[i]==max)res+=count[i];
        }
        return res;
    }
}
