package SlidingWindTwoPointer;
import java.util.*;
public class longestSubsWithRepeatingChar {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int st=0;
        int maxLen=0;
        for(int end=0; end<s.length(); end++){
            char ch=s.charAt(end);
            if(map.containsKey(ch)){
                st=Math.max(st,map.get(ch)+1);
            }
            map.put(ch,end);
            maxLen=Math.max(maxLen,end-st+1);
        }
        return maxLen;
    }
}
