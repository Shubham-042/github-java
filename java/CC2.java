public class CC2 {
    public static  int sum(int[] arr,int i){
        if(i>=arr.length)return 0;
        int take=arr[i]+sum(arr,i+2);
        int skip=sum(arr,i+1);

        return Math.max(take,skip);
    }


    public static int sum2(int[] arr){
        int n=arr.length;

        if(n==1)return arr[0];
        int[] dp=new int[n];
        dp[0]=Math.max(0,arr[0]);
        dp[1]=Math.max(0,Math.max(arr[0],arr[1]));
        for(int i=2; i<arr.length; i++){
            if(arr[i]<0)dp[i]=0;
            dp[i]=Math.max(dp[i-1],arr[i]+dp[i-2]);
        }
        return dp[n-1];
    }
    public static void main(String[] args) {
        int[] arr={-1,5,-2};


        System.out.println(sum2(arr));
    }
}
