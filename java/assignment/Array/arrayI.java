package assignment.Array;

public class arrayI {
    public static void reverse(int[] arr,int i, int j){
        // Time O(n)
        // Space O(1)
        int n=arr.length;

        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static int max(int[] arr){
        //Time O(n)
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int min(int[] arr){
        //Time O(n)
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]<min) min=arr[i];
        }
        return min;
    }
    public static void prefix(int[] arr){
        int n=arr.length;
        for(int i=1; i<n; i++){
            arr[i]=arr[i]+arr[i-1];
        }
    }
    public static int countFreq(int[] arr){
        int n=arr.length;
        int max=max(arr);
        int[] freq=new int[max+1];
        for(int i=0; i<n; i++){
            freq[arr[i]]++;
        }
        int countMax=max(freq);
        return countMax;
    }
    public static void rightRotate(int[] arr,int k){
        // Time O(n)
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }
    public static void leftRotate(int[] arr,int k){
        // Time O(n)
        int n=arr.length;
        k=k%n;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        leftRotate(arr,7);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
