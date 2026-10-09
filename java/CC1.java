import java.util.ArrayList;
import java.util.List;

public class CC1 {
    public static  void sub(int[] nums, int i, List<Integer> curr,List<List<Integer>> ans){

        if(i==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[i]);
        sub(nums,i+1,curr,ans);
        curr.remove(curr.size()-1);
        sub(nums,i+1,curr,ans);

    }



    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<List<Integer>> ans=new ArrayList<>();
        sub(arr,0,new ArrayList<>(),ans);
        System.out.println(ans);
    }
}
