package backTracking;
import java.util.*;
public class combinationSum {
    private void helper(int i,int[] nums,int target,ArrayList<Integer> curr,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(i==nums.length || target<0)return;
        //skip
        helper(i+1,nums,target,curr,ans);
        //pick
        curr.add(nums[i]);
        helper(i,nums,target-nums[i],curr,ans);
        curr.remove(curr.size()-1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }
}
