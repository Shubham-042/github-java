package Heap;
import java.util.*;
public class smallestRangeFromKlists {
    class Triplet implements Comparable<Triplet>{
        int num;
        int row;
        int col;
        Triplet(int num,int row,int col){
            this.num=num;
            this.row=row;
            this.col=col;

        }
        public int compareTo(Triplet t){
            return Integer.compare(this.num,t.num);
        }

    }
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<Triplet> pq=new PriorityQueue<>();
        int max=Integer.MIN_VALUE;
        int k=nums.size();
        for(int i=0; i<k; i++){
            int val=nums.get(i).get(0);
            max=Math.max(max,val);
            pq.offer(new Triplet(val,i,0));
        }

        Triplet first=pq.peek();
        int a=first.num;
        int b=max; // range [a,b]
        while(true){
            Triplet top=pq.poll();
            int ele=top.num; int row=top.row; int col=top.col;
            if(max-ele<b-a || (max-ele==b-a && ele<a)){
                a=ele;
                b=max;
            }
            if(col+1==nums.get(row).size())break;
            int next=nums.get(row).get(col+1);
            max=Math.max(max,next);
            pq.offer(new Triplet(next,row,col+1));
        }
        return new int[]{a,b};
    }



    //                            SOLUTION 2
//    public int[] smallestRange(List<List<Integer>> nums) {
//    PriorityQueue<Triplet> pq=new PriorityQueue<>();
//    int max=Integer.MIN_VALUE;
//    int min=Integer.MAX_VALUE;
//    int k=nums.size();
//       for(int i=0; i<k; i++){
//        int val=nums.get(i).get(0);
//        max=Math.max(max,val);
//        min=Math.min(min,val);
//        pq.offer(new Triplet(val,i,0));
//    }
//
//    int a=min;
//    int b=max; // range [a,b]
//        while(true){
//        Triplet top=pq.poll();
//        int ele=top.num; int row=top.row; int col=top.col;
//        if(max-ele<b-a || (max-ele==b-a && ele<a)){
//            a=ele;
//            b=max;
//        }
//        if(col+1==nums.get(row).size())break;
//        int next=nums.get(row).get(col+1);
//        max=Math.max(max,next);
//        pq.offer(new Triplet(next,row,col+1));
//    }
//        return new int[]{a,b};
//}
}
