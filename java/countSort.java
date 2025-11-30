public class countSort {
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
    static void sort(int[] arr){
        int max=findMax(arr);
        int[] count=new int[max+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        int k=0;
        for(int i=0; i<count.length; i++){
            for(int j=0; j<count[i]; j++){
                arr[k++]=i;
            }
        }
    }
    static void optimiseCountSort(int[] arr){
        int n=arr.length;
        int[] output=new int[n];
        int max=findMax(arr);
        int[] count=new int[max+1];
        for(int i=0; i<n; i++){
            count[arr[i]]++;
        }
        for(int i=1; i< count.length; i++){
            count[i]+=count[i-1];
        }
        for(int i=n-1; i>=0; i--){
            int idx=count[arr[i]]-1;
            output[idx]=arr[i];
            count[arr[i]]--;
        }
        for(int i=0; i<n; i++){
            arr[i]=output[i];
        }
    }

    public static void main(String[] args) {
        int[] arr={2,3,2,4,0,1,4,1,0,2};
        optimiseCountSort(arr);
        printArray(arr);
    }

}
