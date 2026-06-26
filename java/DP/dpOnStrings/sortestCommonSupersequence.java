package DP.dpOnStrings;

public class sortestCommonSupersequence {
    public static String  lcs(String s1,String s2){
        int m=s1.length();
        int n=s2.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }


        }
        StringBuilder ans=new StringBuilder("");
        int i=m;
        int j=n;
        while(i>0 && j>0){
            if(s1.charAt(i-1)==s2.charAt(j-1)) {
                ans.append(s1.charAt(i-1));
                i--;
                j--;
            }
            else if(dp[i-1][j]>dp[i][j-1]){
                i--;
            }else j--;

        }
        ans.reverse();

        return ans.toString();
    }
    public String shortestCommonSupersequence(String s1, String s2) {
        String LCS=lcs(s1,s2);
        int i=0,j=0,k=0; //i->s1,j->s2,k->LCS
        String scs="";
        while(i<s1.length() && j<s2.length() && k<LCS.length()){
            while( s1.charAt(i)!=LCS.charAt(k)){
                scs+=s1.charAt(i);
                i++;
            }
            while( s2.charAt(j)!=LCS.charAt(k)){
                scs+=s2.charAt(j);
                j++;
            }
            scs+=LCS.charAt(k);
            i++;
            j++;
            k++;
        }
        while(i<s1.length()){
            scs+=s1.charAt(i);
            i++;
        }
        while(j<s2.length()){
            scs+=s2.charAt(j);
            j++;
        }
        return scs;
    }
}
