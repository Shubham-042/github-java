import java.util.*;

public class grayCode {
    public List<Integer> grayCode(int n) {
        if(n==0){
            List<Integer> base=new ArrayList<>();
            base.add(0);
            return base;
        }
        List<Integer> prev=grayCode(n-1);
        List<Integer> ans=new ArrayList<>();
        //add 0 prefix
        for(int num:prev){
            ans.add(num);
        }
        //add 1 prefix
        int add=1<<(n-1);
        for(int i=prev.size()-1; i>=0; i--){
            ans.add(prev.get(i)+add);
        }
        return ans;
    }
}
