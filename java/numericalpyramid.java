import java.util.Scanner;
public class numericalpyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        int m=sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int k=1; k<=n-i; k++){ //space
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            for(int l=i-1; l>=1; l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}

