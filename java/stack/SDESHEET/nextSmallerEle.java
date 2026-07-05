package stack.SDESHEET;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class nextSmallerEle {
    static ArrayList<Integer> nextSmallerElement(int[] arr) {
        // code here
        Stack<Integer> st=new Stack<>();
        int n=arr.length;

        ArrayList<Integer> nse=new ArrayList<>();

        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && arr[i]<=st.peek())st.pop();

            if(!st.isEmpty() && arr[i]>st.peek()){
                nse.add(st.peek());
            }else{
                nse.add(-1);
            }
            st.push(arr[i]);
        }
        Collections.reverse(nse);
        return nse;
    }
}
