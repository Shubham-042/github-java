package stack;

import java.util.Stack;

public class insertion {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(23);
        st.push(90);
        st.push(5);
        System.out.println(st);
        int idx=2;
        int x=7;
        Stack<Integer> rt=new Stack<>();
        while(st.size()>idx){
            rt.push(st.pop());
        }
        st.push(x);
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);
    }
}
