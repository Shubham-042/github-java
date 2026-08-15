package SlidingWindTwoPointer;

public class minSwapToGroup1CircularArray {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        int k=0; //window size
        for(int num:nums){
            if(num==1)k++;
        }

        int zeroes=0;
        int minOp=Integer.MAX_VALUE;
        for(int i=0; i<k; i++){
            if(nums[i]==0)zeroes++;
        }
        minOp=Math.min(minOp,zeroes);

        for(int i=k; i<n+k-1; i++){  // sliding window upto n+k-1
            if(nums[(i-k)%n]==0)zeroes--; // for circular array
            if(nums[i%n]==0)zeroes++;
            minOp=Math.min(minOp,zeroes);

        }

        return minOp;

    }
}
