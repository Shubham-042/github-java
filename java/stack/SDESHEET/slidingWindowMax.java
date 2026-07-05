package stack.SDESHEET;
import java.util.*;
public class slidingWindowMax {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        Deque<Integer> dq=new ArrayDeque<>();
        int[] ans=new int[n-k+1];
        for(int i=0; i<k; i++){
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i])dq.pollLast();

            dq.offerLast(i);
        }
        int idx=0;
        for(int i=k; i<n; i++){
            ans[idx++]=nums[dq.peekFirst()];

            //remove indices out of current window
            while(!dq.isEmpty() && dq.peekFirst()<=i-k)dq.pollFirst();

            //remove smaller ele
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i])dq.pollLast();

            dq.offerLast(i);
        }
        ans[idx]=nums[dq.peekFirst()];
        return ans;
    }
}
