import java.util.Scanner;
public class arrayaQuesSet2 {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int[] reverseArray(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        int j=0;
        //traverse original array in reverse direction
        for(int i=n-1; i>=0; i--){
            ans[j++]=arr[i];
        }
        return ans;

    }
    static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    // ques1
    static void sortZeroesAndOnes(int[] arr){
    int n=arr.length;
    int zeroes=0;
    //count no. of zeroes
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                zeroes++;
            }
        }
    //0-zeroes-1 : 0, zeroes-n-1 : 1
        for(int i=0; i<n; i++){
            if(i<zeroes){
                arr[i]=0;
            } else
                arr[i]=1;
        }
    }
    //ques1
    static void sortZeroesAndOnesApproach2(int [] arr){
        int n=arr.length;
        int left=0,right=n-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }
    }

    //ques2
    static void sortByParity(int[] arr){
        int n=arr.length;
        int left=0,right=n-1;
        while(left<right){
            if(arr[left]%2==1&&arr[right]%2==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }
    }
//    ques3
     static int[] sortSquares(int[] arr){
        int n=arr.length;
        int left=0, right=n-1;
        int[] ans=new int[n];
        int k=0; // we can traverse ans array by this variable
         while(left<=right){
             if(Math.abs(arr[left])>Math.abs(arr[right])){
                 ans[k++]=arr[left]*arr[left];
             left++;
             }
             else {
                 ans[k++]=arr[right]*arr[right];
                 right--;
             }
         }
         return ans;
     }
//     ques4 M1
    static int[] prefixSumArray(int[] arr){
        int n=arr.length;
        int[] pref=new int[n];
        pref[0]=arr[0];
        for(int i=1; i<n; i++){
            pref[i]=pref[i-1]+arr[i];
        }
        return pref;
    }
//    ques4 M2
static int[] prefixSumArrayM2(int[] arr){
        int n=arr.length;
        for(int i=1; i<n; i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter" +n+ " elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array");
        printArray(arr);
        //ques1
//        sortZeroesAndOnes(arr);
//        System.out.println("Sorted array");
//        printArray(arr);
        //ques1 approach 2
//        sortZeroesAndOnesApproach2(arr);
//        System.out.println("sorted array");
//        printArray(arr);

//        ques2
//        sortByParity(arr);
//        System.out.println("sorted array");
//        printArray(arr);

//        ques3
//        int[] ans=sortSquares(arr);
//        System.out.println("sorted array");
//        ans=reverseArray(ans);
//        printArray(ans);

//        ques4
//        int[] pref=prefixSumArray(arr);
//        printArray(pref);
//        ques4M2
        prefixSumArrayM2(arr);
        printArray(arr);
    }
}
