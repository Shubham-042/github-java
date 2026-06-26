package DP.dpOnStrings;
import java.util.*;
public class wordBreak {
    boolean solve(String s,int start,HashSet<String> set,boolean[] dp){
        if(start==s.length()) return true;
        if(!dp[start]) return dp[start];
        for(int end=start+1; end<=s.length(); end++){
            String curr=s.substring(start,end);
            if(set.contains(curr) && solve(s,end,set,dp)){
                return dp[start]= true;
            }
        }
        return dp[start]= false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set =new HashSet<>(wordDict);
        boolean[] dp=new boolean[s.length()];
        return solve(s,0,set,dp);
    }
}
