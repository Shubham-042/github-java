package stack.SDESHEET;
import java.util.*;
public class celebrityProblem {
   //          T.C O(n)    S.C O(1)

    public int celebrityOptimiseSpace(int mat[][]) {
        int n=mat.length;
        int cand=0;

        for(int i=1; i<n; i++){
            if(mat[cand][i]==1)cand=i;
        }
        // verification
        for(int i=0; i<n; i++){
            if(cand!=i && (mat[cand][i]!=0 || mat[i][cand]!=1))return -1;
        }
        return cand;
    }



    //         T.C O(n)    S.C O(n)

    public int celebrity(int mat[][]) {
        int n=mat.length;
        Stack<Integer> st=new Stack<>();

        for(int i=0; i<n; i++){
            st.push(i);
        }

        while(st.size()>1){
            int i=st.pop();
            int j=st.pop();

            if(mat[i][j]==0){
                //eliminate j
                st.push(i);
            }else{
                st.push(j);
            }
        }

        // check for mat[i][cel]==1 and mat[cel][i]==0
        int cel=st.pop();
        for(int i=0; i<n; i++){
            if(cel!=i && (mat[i][cel]!=1 || mat[cel][i]!=0))return -1;
        }
        return cel;

    }
}
