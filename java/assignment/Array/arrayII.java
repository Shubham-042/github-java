package assignment.Array;
import java.util.*;

public class arrayII {
    public static int binarySearch(int[] arr,int target){
        //Time O(logn) Space O(1)
        int n=arr.length;
        int left=0;
        int right=n-1;
        int ans=-1;
        while(left<=right){
            int mid=left+ (right-left)/2;
            if(arr[mid]<=target){
                ans=mid;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return ans;
    }
    public static int remDuplicate(int[] arr){
        int n=arr.length;
        if(n==0) return 0;
        int k=1;
        for(int i=1; i<n; i++){
            if(arr[i]!=arr[i-1]){
                arr[k++]=arr[i];
            }
        }
        return k;
    }
    public static int findDuplicate(int[] nums) {
        int slow=nums[0];
        int fast=nums[0];
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);
        slow=nums[0];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
    public static int totalSum(int[] arr){
        int n=arr.length;
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static int pivotIndex(int[] arr){
        int n=arr.length;
        int preSum=0;
        int total=totalSum(arr);
        if(total-arr[0]==0) return 0;
        for(int i=1; i<n; i++){
            preSum+=arr[i-1];
            int sufSum=total-preSum-arr[i];
            if(preSum==sufSum) return i;
        }
        return -1;
    }
    public static void bubble(int[] arr){
        //stable
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void selection(int[] arr){
        //unstable
        int n=arr.length;
        for(int i=1; i<n-1; i++){
            int minIdx=i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[minIdx]){
                    minIdx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIdx];
            arr[minIdx]=temp;
        }
    }
    public static void insertion(int[] arr){
        //stable
        int n=arr.length;
        for(int i=1; i<n; i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=nums[i];
            int rem=sum%k;
            if(map.containsKey(rem)){
                if(i-map.get(rem)>1)return true;

            } else map.put(rem,i);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={1,7,3,6,5,6};
        int n=arr.length;
        System.out.println(pivotIndex(arr));



    }
}
