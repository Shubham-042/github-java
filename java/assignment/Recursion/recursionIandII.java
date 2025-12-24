package assignment.Recursion;

import java.util.Arrays;

public class recursionIandII {
    public static int fact(int n){
        if(n==1) return 1;
        return n*fact(n-1);
    }
    public static int pow(int a, int b){
        if(b==0) return 1;
        int smallAns=pow(a,b/2);
        if(b%2==0) return smallAns*smallAns;
        else return a*smallAns*smallAns;
    }
    public static void print1Ton(int n){
        if(n==0) return;
        print1Ton(n-1);
        System.out.print(n+" ");
    }
    public static int countDigit(int n){
        int c=n;
        int count=0;
        while(n>0){
            int r=n%10;
            if(r!=0 && c%r==0)count++;
            n/=10;
        }
        return count;
    }
    public static int sumArray(int[] arr){
        if(arr.length==0) return 0;
        return arr[0]+sumArray(Arrays.copyOfRange(arr,1,arr.length));
    }
    class pivotIndexByRecursion{
        public int rangeOfSum(int[] arr,int st,int end){
            if(st>end) return 0;
            return arr[st]+rangeOfSum(arr,st+1,end);
        }
        public int pivot(int[] arr,int idx){
            if(idx==arr.length) return -1;
            int leftSum=rangeOfSum(arr,0,idx-1);
            int rightSum=rangeOfSum(arr,idx+1,arr.length-1);
            if(leftSum==rightSum) return idx;
            return pivot(arr,idx+1);
        }
        public int pivotIndex(int[] nums) {
            return pivot(nums,0);
        }
    }
    public static int fib(int n){
        // time o(2^n)
        if(n==0 || n==1) return n;
        return fib(n-1)+fib(n-2);
    }
    public static int fib2(int n){
        //time o(n)
        if(n<=1) return n;
        int a=0;
        int b=1;
        for(int i=2; i<=n; i++){
            int c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
    public static int towerOfHanoi(int n,String src,String helper,String dest){
        if(n==0 || n==1)return n;
        return towerOfHanoi(n-1,src,dest,helper)+1+towerOfHanoi(n-1,helper,src,dest);
    }

    public static void main(String[] args) {
        System.out.println(towerOfHanoi(3,"A","B","C"));

    }
}
