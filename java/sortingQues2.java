public class sortingQues2 {
    static void printArray(int[] arr){
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
    static void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    static void sort(int[] arr){
        int n=arr.length;
        int x=-1,y=-1;
        if(n<=1) return;
        for(int i=1; i<n; i++){
            if(arr[i-1]>arr[i]){
                    if(x==-1){
                        x=i-1;
                        y=i;
                    } else y=i;
            }
        }
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static void partition(int[] arr){
        int l=0,r=arr.length-1;
        while(l<r){
            while(arr[l]<0) l++;
            while(arr[r]>=0) r--;
            if(l<r){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
        }
    }
    static void sort0s1s2s(int[] a){
        int lo=0,mid=0,hi=a.length-1;
        //explore the unknown region
        while(mid<=hi){
            if(a[mid]==0){
                swap(a,mid,lo);
                mid++;
                lo++;
            } else if(a[mid]==1){
                mid++;
            } else{
                swap(a,mid,hi);
                hi--;
            }
        }
    }

    public static void main(String[] args) {
//        int[] arr={10,2,3,4,5,6,7,8,9,1};
//        sort(arr);
//        printArray(arr);

//        int[] arr={-12,3,2,-1,-23,11};
//        partition(arr);
//        printArray(arr);

        int[] a={1,2,1,1,0,2,0,1,2,2,0,0,1};
        sort0s1s2s(a);
        printArray(a);
    }

}
