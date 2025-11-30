public class rotatedBinarySearch {
    static int minEle(int[] arr){
        int n=arr.length;
        int st=0,end=n-1;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]>arr[n-1]){
                st=mid+1;
            } else if(arr[mid]<=arr[n-1]){
                ans=mid;
                end=mid-1;
            }
        }
        return ans;
    }
    static int serarch(int[] a,int target){
        int st=0,end=a.length-1;
        int ans=-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(a[mid]==target) return mid;
            else if(a[mid]<a[end]){
                if(target>=a[mid] && target<=a[end]) st=mid+1;
                else end=mid-1;

            }else{
                if(target<a[mid] && target>=a[st]) end=mid-1;
                else st=mid+1;
            }
        }
        return -1;
    }
    //for duplicate elements in array
    static int serarch_(int[] a,int target){
        int st=0,end=a.length-1;
        int ans=-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(a[mid]==target) return mid;
            else if(a[st]==a[mid]&&a[end]==mid){
                st++;
                end--;
            }
            else if(a[mid]<=a[end]){
                if(target>=a[mid] && target<=a[end]) st=mid+1;
                else end=mid-1;

            }else{
                if(target<a[mid] && target>=a[st]) end=mid-1;
                else st=mid+1;
            }
        }
        return -1;
    }
    static boolean searchMatrix(int[][] a, int target){
        int n=a.length,m=a[0].length;
        int st=0,end=n*m-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            int midElt=a[mid/m][mid%m];
            if(midElt==target) return true;
            if(target<midElt){
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        int target=12;
//        int[] arr={10,11,12,1,2,3,4,5,6,7,8,9};
//        System.out.println(serarch(arr,target));

//        int[] a={1,1,1,2,2,2,3,1};
//        int target=2;
//        System.out.println(serarch_(a,target));


        //ques searchMatrix
        int[][] a={{1,2,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=3;
        System.out.println(searchMatrix(a,target));
    }
}
