package Heap;
import java.util.*;
public class kClosestPointFromOrigin {
    private class Trip{
        long dist;
        int x;
        int y;
        Trip(long dist,int x,int y){
            this.dist=dist;
            this.x=x;
            this.y=y;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Trip> pq=new PriorityQueue<>((a,b)->Long.compare(b.dist,a.dist));
        int[][] ans=new int[k][2];

        for(int[] point:points){
            int x=point[0];
            int y=point[1];
            long dist=x*x+y*y;
            Trip triplet=new Trip(dist,x,y);

            pq.offer(triplet);
            if(pq.size()>k)pq.poll();
        }
        int i=0;
        while(pq.size()>0){
            Trip triplet=pq.poll();
            int x=triplet.x;
            int y=triplet.y;
            ans[i++]=new int[]{x,y};
        }
        return ans;
    }
}
