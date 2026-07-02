package Heap;
import java.util.*;
public class nearlySorted {
    public void nearlySorted(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        // t.c nlogk
        //space o(k)
        int idx=0;
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);

            if(pq.size()>k){
                arr[idx++]=pq.remove();
            }
        }
        while(pq.size()>0) arr[idx++]=pq.remove();
    }
}
