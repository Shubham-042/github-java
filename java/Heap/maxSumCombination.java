package Heap;
import java.util.*;
public class maxSumCombination {
    class Triplet implements Comparable<Triplet>{
        int sum;
        int row;
        int col;
        Triplet(int sum,int row,int col){
            this.sum=sum;
            this.row=row;
            this.col=col;

        }
        public int compareTo(Triplet t){
            return Integer.compare(t.sum,this.sum);
        }

    }
    void rev(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public ArrayList<Integer> topKSumPairs(int[] a, int[] b, int k) {
        // code here
        int n=a.length;
        Arrays.sort(a);
        rev(a);
        Arrays.sort(b);
        rev(b);

        PriorityQueue<Triplet> pq=new PriorityQueue<>();
        pq.add(new Triplet(a[0]+b[0],0,0));
        HashSet<String> set=new HashSet<>();
        set.add("0#0");

        ArrayList<Integer> ans=new ArrayList<>();
        while(k-->0){
            Triplet top=pq.poll();
            ans.add(top.sum);
            int i=top.row; int j=top.col;

            if(i+1<n && set.add((i+1)+"#"+j))
                pq.offer(new Triplet(a[i+1]+b[j],i+1,j));


            if(j+1<n && set.add(i+"#"+(j+1)))
                pq.offer(new Triplet(a[i]+b[j+1],i,j+1));
        }

        return ans;
    }
}
