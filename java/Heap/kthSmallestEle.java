package Heap;
import java.util.*;
public class kthSmallestEle {
        public int kthSmallest(int[] arr, int k) {
            // Code here
            PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

            for(int i=0; i<arr.length; i++){
                if(k>0){
                    k--;
                    pq.add(arr[i]);
                }else{
                    pq.add(arr[i]);
                    pq.remove();
                }
            }
            return pq.peek();
        }
}
