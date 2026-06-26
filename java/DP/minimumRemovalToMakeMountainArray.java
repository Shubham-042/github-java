package DP;

public class minimumRemovalToMakeMountainArray {
    // lis from left to right + lis from right to left -1
    public static int  minimumMountainRemovals(int[] nums) {
        int n=nums.length;
        //LIS
        int[] dp1=new int[n];
        for(int i=0; i<n; i++){
            for(int j=0; j<=i-1; j++){
                if(nums[i]>nums[j]){
                    dp1[i]=Math.max(dp1[i],dp1[j]);
                }
            }
            dp1[i]+=1;

        }
        //LIS->right to left
        int[] dp2=new int[n];
        for(int i=n-1; i>=0; i--){
            for(int j=i+1; j<n; j++){
                if(nums[i]>nums[j]){
                    dp2[i]=Math.max(dp2[i],dp2[j]);
                }
            }
            dp2[i]+=1;

        }
        int max=0;
        for(int i=0; i<n; i++){
            if(dp1[i]>1 && dp2[i]>1){
                int left=dp1[i];
                int right=dp2[i];
                max=Math.max(max,left+right-1);
            }
        }
        if(max<3)return 0;
        return n-max;
    }

    public static void main(String[] args) {
        int[] nums={2,4,1,5,7,8,9};
        System.out.println(minimumMountainRemovals(nums));
    }
}
