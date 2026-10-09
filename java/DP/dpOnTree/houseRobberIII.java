package DP.dpOnTree;

public class houseRobberIII {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    public class Pair{
        int take;
        int skip;
        Pair(int take,int skip){
            this.take=take;
            this.skip=skip;
        }
    }
    public Pair solve(TreeNode root){
        if(root==null)return new Pair(0,0);

        Pair left=solve(root.left);
        Pair right=solve(root.right);

        int take=root.val+left.skip+right.skip;

        int skip=Math.max(left.take,left.skip)+Math.max(right.take,right.skip);

        return new Pair(take,skip);
    }
    public int rob(TreeNode root) {
        Pair ans=solve(root);
        return Math.max(ans.take,ans.skip);
    }
}
