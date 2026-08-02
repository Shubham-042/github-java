package binarySearch;

public class nthRoot {
    private long check(int n,int m,int mid){
        long ans=1;

        for(int i=0; i<n; i++){
            ans*=mid;
            if(ans>m)return ans;
        }
        return ans;
    }
    public int nthRoot(int n, int m) {
        // code here
        if(m==0) return 0;
        int low=1;
        int high=m;

        while(low<=high){
            int mid=low+(high-low)/2;
            long ans=check(n,m,mid);
            if(ans==m){
                return mid;
            }
            else if(ans>m){
                high=mid-1;
            }else low=mid+1;
        }
        return -1;

    }
}
