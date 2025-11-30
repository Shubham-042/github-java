public class RedixSort {
    static void printArray(int[] arr){
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
    static int findMax(int[] arr){
        int mx=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>mx) mx=arr[i];
        }
        return mx;
    }
    static void CountSort(int[] arr,int place){
        int n=arr.length;
        int[] output=new int[n];
        int[] count=new int[10];
        for(int i=0; i<arr.length; i++){
            count[(arr[i]/place)%10]++;
        }
        for(int i=1; i< count.length; i++){
            count[i]+=count[i-1];
        }
        for(int i=n-1; i>=0; i--){
            int idx=count[(arr[i]/place)%10]-1;
            output[idx]=arr[i];
            count[(arr[i]/place)%10]--;
        }
        for(int i=0; i<n; i++){
            arr[i]=output[i];
        }
    }
    static void redix(int[] arr){
        int max=findMax(arr);
        //apply counting sort to sort elements based on plave value
        for(int place=1; max/place>0; place*=10){
           CountSort(arr,place);
        }
    }

    public static void main(String[] args) {
        int[] arr={2,109,33,432,34};
        redix(arr);
        printArray(arr);
    }

}
