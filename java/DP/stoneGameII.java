package DP;
import java.util.*;
public class stoneGameII {
    int solveForAlice(int[] piles,int person,int i,int M,int[][][] dp){
        if(i>=piles.length)return 0;
        if(dp[person][i][M]!=-1)return dp[person][i][M];
        int stones=0;
        int result=(person==1)?Integer.MIN_VALUE:Integer.MAX_VALUE;
        for(int x=1; x<=Math.min(2*M,piles.length-i); x++){
            stones+=piles[i+x-1];
            if(person==1){
                result=Math.max(result,stones+solveForAlice(piles,0,i+x,Math.max(M,x),dp));

            }else{
                result=Math.min(result,solveForAlice(piles,1,i+x,Math.max(M,x),dp));
            }
        }
        return dp[person][i][M]= result;
    }
    public int stoneGameII(int[] piles) {
        int n=piles.length;
        int[][][] dp=new int[2][101][101];
        for(int[][] mat:dp){
            for(int[] row:mat){
                Arrays.fill(row,-1);
            }
        }
        //1 for alice
        //0 for bob
        return solveForAlice(piles,1,0,1,dp);
    }
}
