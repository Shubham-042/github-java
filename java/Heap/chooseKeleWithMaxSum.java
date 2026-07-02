package Heap;
import java.util.*;
public class chooseKeleWithMaxSum {
    public long[] findMaxSum(int[] nums1, int[] nums2, int k) {
        int n=nums1.length;
        int[][] list=new int[n][3];
        for(int i=0; i<n; i++){
            list[i][0]=nums1[i];
            list[i][1]=i;
            list[i][2]=nums2[i];
        }

        Arrays.sort(list,(a,b)->Integer.compare(a[0],b[0]));

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        long[] ans=new long[n];

        long sum=0;

        for(int i=0; i<n; i++){

            if(i>0 && list[i][0]==list[i-1][0]){

                ans[list[i][1]]=ans[list[i-1][1]];

            }
            else ans[list[i][1]]=sum;
            pq.offer(list[i][2]);
            sum+=list[i][2];
            if(pq.size()>k){
                sum-=pq.poll();
            }

        }
        return ans;

    }
}
