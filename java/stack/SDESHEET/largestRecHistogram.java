package stack.SDESHEET;
import java.util.*;
public class largestRecHistogram {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] nse=new int[n];
        int[] pse=new int[n];
        Stack<Integer> st=new Stack<>();

        //nse
        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && heights[i]<=heights[st.peek()])st.pop();

            if(st.isEmpty()){
                nse[i]=n;
            }else{
                nse[i]=st.peek();
            }
            st.push(i);
        }

        while(!st.isEmpty())st.pop();

        //pse
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && heights[i]<=heights[st.peek()])st.pop();

            if(st.isEmpty()){
                pse[i]=-1;
            }else{
                pse[i]=st.peek();
            }
            st.push(i);
        }

        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            max=Math.max(max,(nse[i]-pse[i]-1)*heights[i]);
        }
        return max;
    }
}
