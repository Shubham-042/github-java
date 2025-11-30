import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int num=1;
//        while(num <= n){
//            System.out.println(num);
//            num++;
//        int sum=0;
//        for(int num=n; num>=1; num--){
//            sum=sum+num;
//            System.out.println(num);
        do{
            System.out.println(num);
            num++;
        }while(num<=n);

        }
//            System.out.println(sum);
    }

