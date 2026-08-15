import java.util.*;

public class codeforces {

        public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           int t=sc.nextInt();
           while(t-->0){
               int n=sc.nextInt();

               int a=sc.nextInt();
               int damage=a;
               for(int i=1;i<n;i++){
                   int b=sc.nextInt();
                   if(a==b){
                       damage+=b;
                       break;
                   }
                   damage+=b;
                   a=b;
               }
               System.out.println(damage);
           }
        }

}