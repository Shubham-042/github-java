import java.util.Scanner;
public class sum_of_twonum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first num:");
        int num_1=sc.nextInt();
        System.out.println("Enter second num:");
        int num_2=sc.nextInt();
        int sum=num_1 + num_2;
        System.out.println("sum is "+sum);
    }
}
