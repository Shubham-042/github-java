package queue.interviewQues;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        Stack<Integer> st=new Stack<>();
//        while(q.size()>0){
//            st.push(q.remove());
//        }
//        while(st.size()>0){
//            q.add(st.pop());
//        }
//        System.out.println(q);

//        for reversing kth element
        Queue<Integer> q2=new LinkedList<>();
        for(int i=1; i<=4; i++){
            st.push(q.remove());
        }
        while(q.size()>0){
            q2.add(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        while(q2.size()>0){
            q.add(q2.remove());
        }
        System.out.println(q);


    }
}
