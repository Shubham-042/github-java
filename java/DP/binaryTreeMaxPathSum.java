package DP;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val,TreeNode left,TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
}
public class binaryTreeMaxPathSum {
    int maxSum=Integer.MIN_VALUE;
    private int lineSum(TreeNode root){
        if(root==null)return 0;
        int leftLineSum=lineSum(root.left);
        int rightLineSum=lineSum(root.right);
        int pathSum=root.val;
        if(leftLineSum>0)pathSum+=leftLineSum;
        if(rightLineSum>0)pathSum+=rightLineSum;
        maxSum=Math.max(maxSum,pathSum);
        return root.val+Math.max(0,Math.max(leftLineSum,rightLineSum));
    }
    public int maxPathSum(TreeNode root) {
        lineSum(root);
        return maxSum;
    }
}
