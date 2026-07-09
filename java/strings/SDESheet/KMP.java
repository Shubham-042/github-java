package strings.SDESheet;
import java.util.*;
public class KMP {
    private void computeLPS(int[] LPS,String pat,int m){
        int len=0;
        LPS[0]=0;
        int i=1;
        while(i<m){
            if(pat.charAt(i)==pat.charAt(len)){
                len++;
                LPS[i]=len;
                i++;
            }else{
                if(len!=0){
                    len=LPS[len-1];
                }else{
                    LPS[i]=0;
                    i++;
                }
            }
        }
    }
    public List<Integer> strStr(String text, String pattern) {
        int n=text.length();
        int m=pattern.length();
        List<Integer> res=new ArrayList<>();
        int[] LPS=new int[m];
        computeLPS(LPS,pattern,m);

        int i=0; int j=0;
        while(i<n){
            if(text.charAt(i)==pattern.charAt(j)){
                i++; j++;

            }
            if(j==m){
                res.add(i-j);
                j=LPS[j-1];
            }else if(i<n && text.charAt(i)!=pattern.charAt(j)){
                if(j!=0){
                    j=LPS[j-1];
                }else{
                    i++;
                }
            }
        }
        return res;
    }
}
