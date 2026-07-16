package trees.BinaryTreeMiscelleneousSDE;
import java.util.*;
public class kthLargestInStream {
    PriorityQueue<Integer> pq;
    int K;
    public kthLargestInStream(int k, int[] nums) {
        pq=new PriorityQueue<>();
        K=k;
        for(int num:nums){
            pq.offer(num);
            if(pq.size()>k)pq.poll();
        }

    }

    public int add(int val) {
        pq.offer(val);
        if(pq.size()>K)pq.poll();

        return pq.peek();
    }
}
