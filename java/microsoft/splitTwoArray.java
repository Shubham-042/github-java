package microsoft;

public class splitTwoArray {
    public static int fair(int[] arr1,int[] arr2){
        int count=0;
        int preSum1=0;
        int preSum2=0;
        int totalSum1=0;
        int totalSum2=0;
        for(int i=0; i<arr1.length; i++){
            totalSum2+=arr2[i];
            totalSum1+=arr1[i];
        }
        for(int i=0; i<arr1.length-1; i++){
            preSum1+=arr1[i];
            preSum2+=arr2[i];
            int rem1=totalSum1-preSum1;
            int rem2=totalSum2-preSum2;
            if(preSum1==rem1 && preSum2==rem2 && preSum1==preSum2)count++;
        }
        return count;
    }
    public static void main(String[] args) {
         int[] arr1={2,-2,-3,3};
         int[] arr2={0,0,4,-4};
        System.out.println(fair(arr1,arr2));
    }
}
