import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter decimal number : ");
        int n= sc.nextInt();
        int ans=0;
        int pw=1;
        while(n>0){
           int rem=n%2;
           ans+=(rem*pw);
           pw*=10;
           n/=2;
        }
        System.out.println(ans);


    }
}
