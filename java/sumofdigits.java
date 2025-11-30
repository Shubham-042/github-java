import java.util.Scanner;
public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int originalNum=n;
        while(n>0){
            int r = n%10;
            n = n/10;
            sum=sum+r;

        }
        System.out.println("sum of digits of "+originalNum+ " is " +sum);
    }
}
