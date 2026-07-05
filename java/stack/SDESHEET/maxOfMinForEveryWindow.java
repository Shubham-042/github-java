package stack.SDESHEET;
import java.util.*;
public class maxOfMinForEveryWindow {
    public ArrayList<Integer> maxOfMins(int[] arr) {
        int n=arr.length;
        int[] nse=new int[n];
        int[] pse=new int[n];

        Stack<Integer> st=new Stack<>();

        //nse
        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && arr[i]<=arr[st.peek()])st.pop();


            nse[i]=st.isEmpty()?n:st.peek();

            st.push(i);
        }
        st.clear();

        //pse
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && arr[i]<=arr[st.peek()])st.pop();

            pse[i]=st.isEmpty()?-1:st.peek();

            st.push(i);
        }

        int[] ans=new int[n+1];
        Arrays.fill(ans,Integer.MIN_VALUE);

        for(int i=0; i<n; i++){
            int len=nse[i]-pse[i]-1;

            ans[len]=Math.max(ans[len],arr[i]);
        }

        for(int i=n-1; i>=1; i--){
            ans[i]=Math.max(ans[i],ans[i+1]);
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=1; i<=n; i++){
            res.add(ans[i]);
        }
        return res;

    }
}
