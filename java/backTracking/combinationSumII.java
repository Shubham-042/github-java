package backTracking;
import java.util.*;
public class combinationSumII {
    private void helper(int idx,int[] nums,int target,ArrayList<Integer> curr,List<List<Integer>> ans){
        if(target<0) return;
        if(target==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=idx; i<nums.length; i++){
            if(i>idx && nums[i]==nums[i-1]) continue;
            curr.add(nums[i]);
            helper(i+1,nums,target-nums[i],curr,ans);
            curr.remove(curr.size()-1);
        }

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        helper(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }
}
