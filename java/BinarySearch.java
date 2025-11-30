public class BinarySearch {
    static boolean binarySearch(int[] arr, int target){
        int n=arr.length;
        int st=0,end=n-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(target==arr[mid]){
                return true;
            }else if(target<arr[mid]){
                end=mid-1;
            } else{
                st=mid+1;
            }
        }
        return false;
    }
    static boolean recursiveBinarySearch(int[] a, int st, int end, int target){
        if(st>end) return false;
        int mid=(st+end)/2;
        if(target==a[mid]) return true;
        else if(target<a[mid]){
            return recursiveBinarySearch(a,st,mid-1,target);
        }else{
            return recursiveBinarySearch(a,mid+1,end,target);
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,5,7,9};
        int target=0;
        while(target!=10){
            System.out.printf("%d exist in arr : %b \n" ,target,binarySearch(arr,target));
            System.out.printf("%d exist in arr : %b \n" ,target,recursiveBinarySearch(arr,0,arr.length-1,target));
            System.out.println();
            target++;
        }
    }
}
