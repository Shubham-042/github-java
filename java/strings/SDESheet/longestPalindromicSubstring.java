package strings.SDESheet;
import java.util.*;
public class longestPalindromicSubstring {
    //            DP O(N^2)
    int[][] dp1;
    String[][] dp2;
    private boolean isPalin(int i,int j,String s){
        if(i>=j)return true;
        if(dp1[i][j]!=-1)return dp1[i][j]==1;
        if(s.charAt(i)!=s.charAt(j)){
            dp1[i][j]=0;
            return false;
        }
        boolean res= isPalin(i+1,j-1,s);
        dp1[i][j]=res?1:0;
        return res;
    }
    private String solve(String s,int i,int j){
        if(i>j)return "";
        if(i==j)return String.valueOf(s.charAt(i));

        if(dp2[i][j]!=null)return dp2[i][j];


        if(isPalin(i,j,s)){
            return dp2[i][j]=s.substring(i,j+1);
        }

        String right=solve(s,i+1,j);
        String left=solve(s,i,j-1);
        if(left.length()>=right.length())return dp2[i][j]=left;
        else return dp2[i][j]=right;
    }

    public String longestPalindrome(String s) {
        int n=s.length();
        dp1=new int[n][n];
        dp2=new String[n][n];
        for(int[] row:dp1)Arrays.fill(row,-1);
        return solve(s,0,s.length()-1);

    }
}
