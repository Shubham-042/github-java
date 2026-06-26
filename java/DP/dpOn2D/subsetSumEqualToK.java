package DP.dpOn2D;
import java.util.*;
public class subsetSumEqualToK {
    private static boolean  helper(int i,int k,int[] arr,int[][] dp){
        if(i==arr.length){
            if(k==0)return true;
            else return false;
        }
        if(dp[i][k]!=-1)return (dp[i][k]==1);
        boolean ans=false;
        //skip
        boolean skip=helper(i+1,k,arr,dp);
        //pick
        if(k-arr[i]<0) return ans=skip;
        else{
            boolean pick=helper(i+1,k-arr[i],arr,dp);
            ans= pick || skip;;
        }
        if(ans) dp[i][k]=1;
        else dp[i][k]=0;
        return ans;

    }
    public static boolean subsetSumToK(int n, int k, int arr[]){
        // Write your code here.
        int[][] dp=new int[n][k+1];
        for(int[] row:dp) Arrays.fill(row,-1);
        boolean ans=helper(0,k,arr,dp);
        return ans;

    }
}
