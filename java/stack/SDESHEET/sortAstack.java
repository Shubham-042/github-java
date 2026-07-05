package stack.SDESHEET;

import java.util.Stack;

public class sortAstack {
    public void insert(Stack<Integer> st, int x){
        if(st.isEmpty() || st.peek()<=x){
            st.push(x);
            return;
        }

        int top=st.pop();

        insert(st,x);

        st.push(top);
    }
    public void sortStack(Stack<Integer> st) {
        // code here
        if(st.isEmpty())return;

        int top=st.pop();

        sortStack(st);

        insert(st,top);

    }
}
