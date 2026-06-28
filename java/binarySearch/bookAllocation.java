package binarySearch;

public class bookAllocation {
    public boolean isValid(int[] arr,int maxAllow,int k){
        int noOfStu=1;
        int pages=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>maxAllow)return false;

            if(pages+arr[i]<=maxAllow){
                pages+=arr[i];
            }else{
                noOfStu++;
                pages=arr[i];
            }
        }
        return noOfStu<=k;
    }
    public int findPages(int[] arr, int k) {
        // code here
        if(k>arr.length)return -1;
        int low=0;
        int high=0;
        int ans=-1;
        for(int num:arr)high+=num; // high will be the sum

        while(low<=high){
            int mid=low+(high-low)/2;
            if(isValid(arr,mid,k)){
                ans=mid;
                high=mid-1;

            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
