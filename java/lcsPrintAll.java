import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class lcsPrintAll {
    public static void printAlllcs(String s1,String s2){
        int n=s1.length();
        int m=s2.length();

        int[][] dp=new int[n+1][m+1];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }


            }
        }
        Set<String> ans=new HashSet<>();
        computeAll(s1,s2,n,m,ans,new StringBuilder(),dp);
        for(String str:ans){
            System.out.println(str);
        }
    }
    public static void computeAll(String s1,String s2,int i,int j,Set<String> ans,StringBuilder sb,int[][] dp){
        if(i==0 || j==0){
            ans.add(sb.reverse().toString());
            sb.reverse();
            return;
        }

        if(s1.charAt(i-1)==s2.charAt(j-1)){
            sb.append(s1.charAt(i-1));
            computeAll(s1,s2,i-1,j-1,ans,sb,dp);
            sb.deleteCharAt(sb.length()-1);
        }else {
            if(dp[i-1][j]==dp[i][j]){
                computeAll(s1,s2,i-1,j,ans,sb,dp);
            }
            if(dp[i][j-1]==dp[i][j]){
                computeAll(s1,s2,i,j-1,ans,sb,dp);
            }
        }
    }
    public static void main(String[] args) {
        String s1="abcdab";
        String s2="bacdb";
//        List<String> ans=new ArrayList<>();
        printAlllcs(s1,s2);
    }
}
