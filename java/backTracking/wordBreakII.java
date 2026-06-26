package backTracking;
import java.util.*;
public class wordBreakII {
    private List<String> ans;
    private HashSet<String> set;
    public void  solve(int i,String s,String currSen){
        if(i>=s.length()){
            ans.add(currSen.trim());
            return;
        }
        for(int j=i; j<s.length(); j++){
            String temp=s.substring(i,j+1);
            if(set.contains(temp)){
                String originalSen=currSen;
                if(!currSen.isEmpty()){
                    currSen+=" ";
                }
                currSen+=temp;
                solve(j+1,s,currSen);
                currSen=originalSen;
            }
        }
    }

    public List<String> wordBreak(String s, List<String> wordDict) {
        ans=new ArrayList<>();
        set=new HashSet<>(wordDict);
        String currSen="";
        solve(0,s,currSen);
        return ans;

    }
}
