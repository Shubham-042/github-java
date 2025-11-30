package stack;
import java.util.Stack;
import java.util.Scanner;

public class copyContent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
         int n;
        System.out.println("Enter the number of  elements you want to insert : ");
        n=sc.nextInt();
        System.out.println("Enter the elements : ");
        for(int i=1; i<=n; i++){
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println(st);

        //in reverse order
        Stack<Integer> rt=new Stack<>();
//        while(st.size()>0){
//
//            int x= st.peek();
//            rt.push(x);
//            st.pop();
//        }
//        System.out.println(rt);
//        OR
        while(st.size()>0){
            rt.push(st.pop());
        }
        System.out.println(rt);

        //in same order using rt stack
        Stack<Integer> gt=new Stack<>();
        while(rt.size()>0){
            gt.push(rt.pop());
        }
        System.out.println(gt);
    }
}
