package stack.SDESHEET;
import java.util.*;
public class MinStack {
//    Stack<Integer> st;
//    Stack<Integer> min;
//    public MinStack() {
//        st=new Stack<>();
//        min=new Stack<>();
//    }
//
//    public void push(int val) {
//        if(st.isEmpty()){
//            st.push(val);
//            min.push(val);
//        }else{
//            st.push(val);
//            if(val<=min.peek())min.push(val);
//        }
//    }
//
//    public void pop() {
//        int top=st.pop();
//        if(top==min.peek())min.pop();
//    }
//
//    public int top() {
//        return st.peek();
//    }
//
//    public int getMin() {
//        return min.peek();
//    }

    //               OR
    class Pair{
        int val;
        int min;
        Pair(int val,int min){
            this.val=val;
            this.min=min;
        }
    }
    Stack<Pair> st;

    public MinStack() {
        st=new Stack<>();
    }

    public void push(int val) {
        if(st.isEmpty() || val<=st.peek().min)st.push(new Pair(val,val));
        else{
            st.push(new Pair(val,st.peek().min));
        }
    }

    public void pop() {
        st.pop();
    }

    public int top() {
        return st.peek().val;
    }

    public int getMin() {
        return st.peek().min;
    }
}
