import java.util.Scanner;

public class arraysQuesSet1 {
//    ques 1
    static int countOccurrence(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
//    ques 2
    static int lastOccurrence(int[] arr,int x){
        int lastIndex=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                lastIndex=i;
            }
        }
        return lastIndex;
    }
//    ques 3
    static int greaterThanX(int[] arr,int x){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>x){
                count++;
            }
        }
        return count;
    }
//    ques 4
    static int pairSum(int[] arr, int target){
        int n=arr.length;
        int ans=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j]==target){
                    ans++;
                }
            }
        }
        return ans;
    }
//    ques 5
    static int findMax(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
//    ques 6
    static int findSecondMax(int[] arr){
        int max=findMax(arr);
        for(int i=0; i< arr.length; i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;

            }
        }
        int secondMax=findMax(arr);
        return secondMax;
    }
//    ques 7
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
//    ques 8
    static int[] rotate(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        int[] ans =new int[n];
        int j=0;
        for(int i=n-k; i<n; i++){
            ans[j++]=arr[i];
        }
        for(int i=0; i<n-k; i++){
            ans[j++]=arr[i];
        }
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
//        System.out.println("enter x");
//        int x = sc.nextInt();
//        System.out.println("count"+countOccurrence(arr,x));
//        System.out.println("last occurrence :" +lastOccurrence(arr,x));
//        System.out.println("no. greater than x is" +greaterThanX(arr,x));
//        System.out.println("enter target");
//        int target=sc.nextInt();
//        System.out.println("target :" +pairSum(arr,target));
//        System.out.println("secondmax: " +findSecondMax(arr));
//
//        int[] ans=reverseArray(arr);
//        printArray(ans);
        System.out.println("enter k");
        int k=sc.nextInt();

        System.out.println("after rotation");
       int[] ans= rotate(arr,k);
       printArray(ans);



    }

}