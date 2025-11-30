package stack;

import java.util.Stack;

public class displayStack {
    public static void displayStReverse(Stack<Integer> st){
        if(st.size()==0) return;
        int top=st.pop();
        System.out.print(top);
        displayStReverse(st);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(23);
        st.push(90);
        st.push(5);
        System.out.println(st);
//        System.out.println(st);
//        Stack<Integer> rt=new Stack<>();
//        while(st.size()>0){
//            rt.push(st.pop());
//        }
//        while(rt.size()>0){
//            st.push(rt.pop());
//        }
//        System.out.println(st);

        //by using array
//    int n= st.size();
//    int[] arr=new int[n];
//    for(int i=n-1; i>=0; i--){
//        arr[i]=st.pop();
//    }
//
//    for(int i=0; i<n; i++){
//        System.out.print(arr[i]+" ");
//        st.push(arr[i]);
//    }
//        System.out.println();
//        System.out.println(st);
        displayStReverse(st);
    }
}
