package stack;

import java.util.Stack;

public class infixToPrefix {
    public static void main(String[] args) {
        Stack<String> val=new Stack<>();
        Stack<Character> op=new Stack<>();
        String infix= "9-(5+3)*4/6";
        System.out.println(infix);
        for(int i=0; i<infix.length(); i++){
            char ch=infix.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                String s="" + ch; //for changing to string
                val.push(s);
            }
            else if(op.size()==0 || ch=='(' || op.peek()=='(')
                op.push(ch);
            else if(ch==')'){
                while(op.peek()!='('){
                    //work
                    String v2 =val.pop();
                    String  v1 =val.pop();
                    char o=op.pop();
                    String t=o + v1 +v2; // concatenate
                    val.push(t);
                }
                op.pop(); //'(' hta diya
            }
            else{
                //priorities
                if(ch=='+' || ch=='-'){
                    //work
                    String v2 =val.pop();
                    String  v1 =val.pop();
                    char o=op.pop();
                    String t=o + v1 +v2; // concatenate
                    val.push(t);
                    op.push(ch);
                }
                if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' ||  op.peek()=='/'){
                        //work
                        String v2 =val.pop();
                        String  v1 =val.pop();
                        char o=op.pop();
                        String t=o + v1 +v2; // concatenate
                        val.push(t);
                        //push
                        op.push(ch);

                    }
                    else{
                        op.push(ch);
                    }
                }
            }
        }
        //val stack ke size ko one bnana hai
        while(val.size()>1){
            String v2 =val.pop();
            String  v1 =val.pop();
            char o=op.pop();
            String t=o + v1 +v2; // concatenate
            val.push(t);
        }
        String prefix=val.pop();
        System.out.println(prefix);
    }


}
