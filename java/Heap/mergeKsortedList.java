package Heap;
import java.util.*;
public class mergeKsortedList {
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
    public ArrayList<Integer> mergeArrays(int[][] mat) {
        // Code here
        PriorityQueue<Triplet> pq=new PriorityQueue<>();

        int k=mat.length;
        for(int i=0; i<k; i++){
            pq.offer(new Triplet(mat[i][0],i,0));
        }

        ArrayList<Integer> ans=new ArrayList<>();

        while(!pq.isEmpty()){
            Triplet top=pq.poll();
            ans.add(top.num);

            int row=top.row;
            int col=top.col;

            if(col+1<mat[row].length){
                pq.offer(new Triplet(mat[row][col+1],row,col+1));
            }
        }
        return ans;

    }
}
