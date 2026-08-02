package SlidingWindTwoPointer;
import java.util.*;
public class countNoOfNiceSubarray {
    public int numberOfSubarrays(int[] nums, int k) {
        int ans=0;
        int oddCount=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int num:nums){
            if(num%2==1)oddCount++;
            ans+=map.getOrDefault(oddCount-k,0);

            map.put(oddCount,map.getOrDefault(oddCount,0)+1);
        }
        return ans;
    }


      //      space o(1)
      public int atMost(int[] nums,int k){
          if(k<0)return 0;
          int left=0;
          int odd=0;
          int count=0;
          for(int right=0; right<nums.length; right++){
              if(nums[right]%2==1)odd++;

              while(odd>k){
                  if(nums[left]%2==1){
                      odd--;

                  }
                  left++;
              }
              count+=right-left+1;
          }
          return count;
      }
    public int numberOfSubarraysOptimise(int[] nums, int k) {
        return atMost(nums,k)-atMost(nums,k-1);
    }
}
