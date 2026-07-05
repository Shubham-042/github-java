package stack.SDESHEET;
import java.util.*;
public class stockSpan {
    class Pair{
        int price;
        int day;
        Pair(int price,int day){
            this.price=price;
            this.day=day;
        }
    }
    Stack<Pair> st;
    public stockSpan() {
        st=new Stack<>();
    }

    public int next(int price) {
        if(st.isEmpty() || price<st.peek().price){
            st.push(new Pair(price,1));
        }
        else{
            int count=1;
            while(!st.isEmpty() && price>=st.peek().price){
                Pair top=st.pop();
                int days=top.day;
                count+=days;

            }
            st.push(new Pair(price,count));
        }
        return st.peek().day;
    }
}
