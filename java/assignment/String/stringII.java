package assignment.String;

import java.util.HashMap;
import java.util.Map;

public class stringII {
    public static void freqOfChar(String s){
        //time o(n)
        int n=s.length();
        int[] freq=new int[26];
        for(int i=0; i<n; i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;   // if ch=='c' then 99-97=2th position of c in freq array
        }
        for(int i=0; i<freq.length; i++){
            if(freq[i]!=0){
                char ch=(char)('a'+i);
                System.out.print(ch+""+freq[i]+" ");
            }
        }
    }
    public static char maxOccurence(String s){
        //time o(n)
        int n=s.length();
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0; i<n; i++){
            char ch=s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        int maxFreq=0;
        char maxChar='\0';
        for(Map.Entry<Character,Integer> entry : mp.entrySet()){
            if(maxFreq<entry.getValue()){
                maxFreq= entry.getValue();
                maxChar= entry.getKey();
            }
        }
        return maxChar;
    }
    public static String remDuplicateChar(String s){
        //time o(n)
        int n=s.length();
        int[] freq=new int[128];
        StringBuilder ans=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(freq[ch]==0){
                ans.append(ch);
                freq[ch]++;
            }
        }
        return ans.toString();
    }
    public static int countWord(String s){
        //time o(n)
        int n=s.length();
        int count=0;
        for(int i=0; i<n; i++){

           if(s.charAt(i)!=' ' && (i==0 || s.charAt(i-1)==' ')) count++;
        }
        return count;
    }
    public static void main(String[] args) {
            String s="hello this is shubham";
        System.out.println(countWord(s));
    }
}






