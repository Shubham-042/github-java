import java.util.Scanner;

class algebra {
    int add(int a, int b) {
        int ans = a + b;
        return ans;
    }
}
    public class sum{
        public static void main(String[] args) {
            algebra obj1=new algebra();
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            int y=sc.nextInt();
            System.out.println("The sum of " +x+ " and " +y+ " is " );
            int ans=obj1.add(x,y);
            System.out.println(ans);
        }
    }
