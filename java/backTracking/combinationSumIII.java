package backTracking;
import java.util.*;
public class combinationSumIII {
    private void helper(int i,int k,int n,ArrayList<Integer> curr,List<List<Integer>> ans){

        if(curr.size()==k && n==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(i>9 || n<0 || curr.size()>k)return;
        //skip
        helper(i+1,k,n,curr,ans);
        //pick
        curr.add(i);
        helper(i+1,k,n-i,curr,ans);
        curr.remove(curr.size()-1);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(1,k,n,new ArrayList<>(),ans);
        return ans;
    }
}
