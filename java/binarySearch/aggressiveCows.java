package binarySearch;
import java.util.*;

public class aggressiveCows {
    public boolean isPossible(int[] stalls,int k, int dist){
        int countCows=1;
        int last=stalls[0];
        for(int i=1; i<stalls.length; i++){
            if(stalls[i]-last>=dist){
                countCows++;
                last=stalls[i];
                if(countCows==k)return true;
            }
        }
        return false;
    }
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        int n=stalls.length;
        Arrays.sort(stalls);
        int st=1,end=stalls[n-1]-stalls[0];
        while(st<=end){
            int mid=st+(end-st)/2;
            if(isPossible(stalls,k,mid)){
                st=mid+1;
            }else end=mid-1;
        }
        return end;
    }
}
