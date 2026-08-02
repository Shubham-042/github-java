package SlidingWindTwoPointer;
import java.util.*;
public class binaryArrayWithSum {

    //        time O(n)  spaceO(1)
    public int atMost(int[] nums,int goal){    // this func calculate no. of subarray<=goal
        if(goal<0)return 0;

        int left=0;
        int count=0;
        int sum=0;
        for(int right=0; right<nums.length; right++){
            sum+=nums[right];
            while(sum>goal){
                sum-=nums[left];
                left++;
            }
            count+=right-left+1;
        }
        return count;
    }
    public int numSubarraysWithSumOptimise(int[] nums, int goal) {
        return atMost(nums,goal)-atMost(nums,goal-1);

    }


    //         time O(1)   space O(n)
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n=nums.length;
        int count=0;
        int sum=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int num:nums){
            sum+=num;

            if(map.containsKey(sum-goal)){
                count+=map.get(sum-goal);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
