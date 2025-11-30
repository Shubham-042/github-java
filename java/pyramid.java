import java.util.Scanner;
public class pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        int m=sc.nextInt();
        int nst=1;
        for(int i=1; i<=n; i++){
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=nst; j++){
                System.out.print("*");
            }
            nst+=2;
            System.out.println();
        }
    }
}
