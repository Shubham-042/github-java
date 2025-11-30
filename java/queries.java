import java.util.Scanner;

public class queries {
    static int[] prefixSumArrayM2(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        System.out.println("enter" + n + " elements ");
        for (int i = 1; i <= n; i++) { //input by 1 based indexing
            arr[i] = sc.nextInt();
        }
        int[] pref=prefixSumArrayM2(arr);
        System.out.println("enter no. of queries");
        int q=sc.nextInt();
        while(q-->0){
            System.out.println("Enter range");
            int l=sc.nextInt();
            int r=sc.nextInt();
            int ans=pref[r]-pref[l-1];
            System.out.println("sum" +ans);
        }
    }
}
