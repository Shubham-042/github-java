package SlidingWindTwoPointer;
import java.util.*;
public class subArraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int ans=0;
        map.put(0,1);
        for(int num:nums){
            sum+=num;

            if(map.containsKey(sum-k)){
                ans+=map.getOrDefault(sum-k,0);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}
