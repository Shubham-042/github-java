package SlidingWindTwoPointer;
import java.util.*;
public class minimumWindowSubstring {
    public String minWindow(String s, String t) {
        int n=s.length();
        int reqCount=t.length(); // to check all char of t present in window or not
        if(t.length()>n)return "";

        Map<Character,Integer> map=new HashMap<>();
        for(char ch:t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int minLen=Integer.MAX_VALUE;
        int strtIdx=0;
        int left=0;
        int right=0;
        while(right<n){
            char ch=s.charAt(right);
            if(map.containsKey(ch) && map.get(ch)>0){
                reqCount--;
            }
            map.put(ch,map.getOrDefault(ch,0)-1);
            while(reqCount==0){
                int currLen=right-left+1;
                if(minLen>currLen){
                    minLen=currLen;
                    strtIdx=left; //window substring starts here
                }
                char strtChar=s.charAt(left);
                map.put(strtChar,map.getOrDefault(strtChar,0)+1); //bcz window shrinks
                if(map.containsKey(strtChar) && map.get(strtChar)>0){
                    reqCount++; //when required char shrinks
                }
                left++;
            }
            right++;
        }
        return minLen==Integer.MAX_VALUE ? "" : s.substring(strtIdx,strtIdx+minLen);
    }
}
