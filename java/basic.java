import java.util.*;
public class basic {
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void reverse(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    } static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int sum(int[] array,int n){
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=array[i];
        }
        return sum;

    }
    static int[] copyArray(int[] arr){
        int[] arrCopy=Arrays.copyOf(arr,arr.length);
        arrCopy[0]=1;
        return arrCopy;
    }
    static boolean isSorted(int[] arr){
        boolean check=false;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    check=true;
                    break;
                }
                else check=false;
            }
        }
        return check;
    }
    static int[] steps(int[] arr,int k){
        int n= arr.length;
        k=k%n;
        int[] ans=new int[n];
        int j=0;
        for(int i=n-k; i<n; i++){
            arr[j++]=arr[i];
        }
        for(int i=0; i<n-k; i++){
            arr[j++]=arr[i];
        }
        return ans;
    }
    static void rotation(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }
    static void sortZeroes(int[] arr){
        int n=arr.length;
        int i=0,j=n-1;
        while(i<j){
            if(arr[i]==1 && arr[j]==0){
               swap(arr,i,j);
               i++;
               j--;
            }
        if(arr[i]==0){
            i++;
        }
        if(arr[j]==1){
            j--;
        }}
    }
    static void evenOddsort(int[] arr){

            int n=arr.length;
            int i=0,j=n-1;
            while(i<j){
                if(arr[i]%2!=0 && arr[j]%2==0){
                    swap(arr,i,j);
                    i++;
                    j--;
                }
                if(arr[i]%2==0){
                    i++;
                }
                if(arr[j]%2!=0){
                    j--;
                }}
        }
        static int[] sortSquare(int[] arr){
        int n=arr.length;
        int k=0;
        int i=0,j=n-1;
        int[] ans=new int[n];
        while(i<=j){
            if(Math.abs(arr[i])>Math.abs(arr[j])){
                ans[k++]=arr[i]*arr[i];
                i++;
            }
            else {
                ans[k++]=arr[j]*arr[j];
                j--;
            }
        }
        return ans;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        basic obj=new basic();
        int[] array={-10,-3,-2,1,4,5};
        int[] ans=sortSquare(array);
        reverse(ans,0,5);
        printArray(ans);


    }
}

