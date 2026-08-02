package SlidingWindTwoPointer;

public class maxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int zeroes=0;
        int st=0;
        int maxLen=0;
        for(int end=0; end<n; end++){
            if(nums[end]==0)zeroes++;

            while(zeroes>k){
                if(nums[st]==0)zeroes--;
                st++;
            }
            maxLen=Math.max(maxLen,end-st+1);
        }
        return maxLen;
    }
}
