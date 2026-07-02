package Heap;
import java.util.*;
public class topKfrequentEle {
    class Pair implements Comparable<Pair>{
        int freq;
        int num;

        Pair(int freq,int num){
            this.freq=freq;
            this.num=num;
        }
        public int compareTo(Pair p){
            if(this.freq==p.freq)return Integer.compare(this.num,p.num);

            return Integer.compare(this.freq,p.freq);
        }

    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(int num:map.keySet()){
            pq.offer(new Pair(map.get(num),num));

            if(pq.size()>k)pq.poll();
        }
        int[] ans=new int[k];
        int i=0;
        while(!pq.isEmpty()){
            ans[i++]=pq.poll().num;
        }
        return ans;
    }
}
