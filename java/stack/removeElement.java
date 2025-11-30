package stack;

import java.util.Stack;

public class removeElement {
    static void removeLast(Stack<Integer> st){
        Stack<Integer> rt=new Stack<>();
        while(st.size()>1){
            rt.push(st.pop());
        }
        st.pop();
        while(rt.size()>0){
            st.push(rt.pop());
        }
    }
    static void removeIdx(Stack<Integer> st,int idx){
        Stack<Integer> rt=new Stack<>();
        while(st.size()>idx){
            rt.push(st.pop());
        }
        st.pop();
        while(rt.size()>0)
            st.push(rt.pop());
    }
    static void pushBottom(Stack<Integer> st,int x){
        Stack<Integer> rt=new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        st.push(x);
        while(rt.size()>0){
            st.push(rt.pop());
        }
    }
    static void reverseStack(Stack<Integer> st){
        if(st.size()==1) return;;
        int top=st.pop();
        reverseStack(st);
        pushBottom(st,top);

    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        System.out.println(st);

//        removeLast(st);
//        System.out.println(st);
//        removeIdx(st,2);
//        System.out.println(st);
//        pushBottom(st,0);
//        System.out.println(st);

        reverseStack(st);
        System.out.println(st);
    }
}
