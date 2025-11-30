import java.util.Scanner;
public class dectobinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int decimal_num=sc.nextInt();
        int ans=0;
        int pw=1;  //2^0=1
        while(decimal_num>0){
            int rem=decimal_num%2;
            ans+=(rem*pw);
            decimal_num/=2;
            pw*=10;
        }
        System.out.println(ans);
    }
}
