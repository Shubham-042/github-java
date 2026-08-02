package SlidingWindTwoPointer;

public class maxPointObtainFromCard {
    public int maxScore(int[] nums, int k) {
        int n=nums.length;
        int total=0;
        for(int num:nums)total+=num;

        int left=0;
        int windowSize=n-k;
        int currSum=0;
        int ans=0;
        for(int right=0; right<n; right++){
            currSum+=nums[right];
            while(right-left+1 > windowSize){
                currSum-=nums[left];
                left++;
            }
            if((right-left+1)==windowSize){
                ans=Math.max(ans,total-currSum);
            }
        }
        return ans;
    }
}
