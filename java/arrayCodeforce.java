import java.util.*;
public class arrayCodeforce {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long[] arr=new long[n];
            for(int i=0; i<n; i++)
                arr[i]=sc.nextInt();
            StringBuilder sb=new StringBuilder();
            long preSum=0;
            long min=Long.MAX_VALUE;
            for(int i=0; i<n; i++){
                preSum+=arr[i];
                min=Math.min(min,preSum);
                sb.append(min);
                if(i<n-1) sb.append(' ');
            }
            sb.append('\n');
            System.out.println(sb);



        }
    }
}
