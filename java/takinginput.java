import java.util.Scanner;
public class takinginput {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); //scanner class
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println("Your name is:"+name);
        System.out.println("Enter your lucky number");
        int num_1= sc.nextInt(); //input of integers
        System.out.println("Your lucky number is:"+num_1);

    }
}
