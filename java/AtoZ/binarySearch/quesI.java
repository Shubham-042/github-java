package AtoZ.binarySearch;

public class quesI {
    public int[] getFloorAndCeil(int[] nums, int x) {
        int st=0;
        int end=nums.length-1;
        int floor=-1;
        int ceil=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]==x)return new int[]{nums[mid],nums[mid]};
            else if(nums[mid]<x){
                floor=nums[mid];
                st=mid+1;
            }
            else{
                ceil=nums[mid];
                end=mid-1;
            }
        }
        return new int[]{floor,ceil};
    }
    public int helper(int[] nums,int target,boolean first){
        int low=0,high=nums.length-1;
        int pos=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                pos=mid;
                if(first){
                    high=mid-1;
                }else{
                    low=mid+1;
                }

            }
            else if(nums[mid]>target){

                high=mid-1;
            }else{
                low=mid+1;
            }

        }
        return pos;
    }
    int searchRotatedSorted(int[] arr, int key) {
        // code here
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid =low+(high-low)/2;
            if(arr[mid]==key)return mid;
            if(arr[low]<=arr[mid]){
                if(key>=arr[low] && key<=arr[mid])high=mid-1;
                else low=mid+1;
            }else{
                if(key>=arr[mid] && key<=arr[high])low=mid+1;
                else high=mid-1;
            }
        }
        return -1;
    }
    public int[] searchRange(int[] nums, int target) {
        int first=helper(nums,target,true);
        int last=helper(nums,target,false);
        return new int[] {first,last};
    }
    public static void main(String[] args) {

    }
}
