package stack.interviewQues;

import java.util.Scanner;
import java.util.Stack;

public class minimumBracketRemove {
    public static void isBalanced(String str){
        Stack<Character> st=new Stack<>();
        int count=0;
        int n=str.length();
        for(int i=0; i<n; i++){
            char ch=str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else{
                if(st.size()==0) {
                    count++;
                    return ;
                }
                if(st.peek()=='(') st.pop();
            }
        }
        if(st.size()>0) {
            count++;
            System.out.println(count);

            return ;
        }
        else return ;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        String str= sc.nextLine();
        isBalanced(str);

    }
}
