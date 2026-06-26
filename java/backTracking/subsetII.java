package backTracking;
import java.util.*;
public class subsetII {
    public void helper(int[] nums,int idx,ArrayList<Integer> curr,List<List<Integer>> ans){
        if(idx==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        //include
        curr.add(nums[idx]);
        helper(nums,idx+1,curr,ans);
        curr.remove(curr.size()-1);
        // exclude
        int i=idx+1;
        while(i<nums.length && nums[i]==nums[i-1])i++;
        helper(nums,i,curr,ans);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        helper(nums,0,new ArrayList<>(),ans);
        return ans;
    }
}
