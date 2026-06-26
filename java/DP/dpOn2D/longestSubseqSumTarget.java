package DP.dpOn2D;
import java.util.*;
public class longestSubseqSumTarget {
    private static  int helper(int i,List<Integer> nums,int target,int[][] dp){
        if(i==nums.size()){
            if(target==0)return 0;
            else return Integer.MIN_VALUE;
        }
        if(dp[i][target]!=-1)return dp[i][target];
        //skip
        int skip=helper(i+1,nums,target,dp);
        //pick
        int pick=Integer.MIN_VALUE;
        if(target>=nums.get(i)){
            int res=helper(i+1,nums,target-nums.get(i),dp);
            if(res!=Integer.MIN_VALUE){
                pick=1+res;
            }
        }
        return dp[i][target]= Math.max(pick,skip);
    }
    public static int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int n=nums.size();
        int[][] dp=new int[n][target+1];
        for(int[] row:dp)Arrays.fill(row,-1);
        int ans=helper(0,nums,target,dp);
        if(ans==Integer.MIN_VALUE)return -1;

        return ans;
    }
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(5);
        int target=7;
        System.out.println(lengthOfLongestSubsequence(list,target));
    }
}
