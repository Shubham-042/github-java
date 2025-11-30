

import java.util.Scanner;

public class recursion {
    static void pI(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        pI(n-1);
        System.out.println(n);
    }
    static void pD(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        pD(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
      int n=sc.nextInt();
//      pI(n);
      pD(n);
    }
}
