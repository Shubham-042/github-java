import java.io.FilterOutputStream;

public class quesBinarySearch {
    static int firstOcc(int[] a, int x){
         int n=a.length;
         int st=0,end=n-1;
         int fo=-1;
         while(st<=end){
             int mid=st+(end-st)/2;
             if(a[mid]==x){
                 fo=mid;
                 end=mid-1;
             } else if(x<a[mid]){
                 end=mid-1;
             }else{
                 st=mid+1;
             }
         }
         return fo;
    }
    static int lastOcc(int[] a, int x){
        int n=a.length;
        int st=0,end=n-1;
        int fo=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(a[mid]==x){
                fo=mid;
                st=mid+1;
            } else if(x<a[mid]){
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        return fo;
    }
   static int sqrt(int x){
        int st=0,end=x;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            int val=mid*mid;
            if(val==x){
                return mid;
            }else if(val<x){
                ans=mid;
                st=mid+1;
            }else end=mid-1;
        }
        return ans;
   }
    public static void main(String[] args) {
//        int[] arr={1,5,5,5,6};
//        int x=5;
//        System.out.println(firstOcc(arr,x));
//        System.out.println(lastOcc(arr,x));

        int x=8;
        System.out.println(sqrt(x));
    }
}
