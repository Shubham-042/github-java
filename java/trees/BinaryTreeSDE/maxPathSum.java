package trees.BinaryTreeSDE;

public class maxPathSum {
    class TreeNode{
        int val;
        TreeNode right;
        TreeNode left;
        TreeNode(int val){
            this.val=val;
        }
    }
    public int maxSum;
    public int solve(TreeNode root){
        if(root==null)return 0;

        int l=Math.max(0,solve(root.left));
        int r=Math.max(0,solve(root.right));

        maxSum=Math.max(maxSum,l+r+root.val);

        return root.val+Math.max(l,r);
    }
    public int maxPathSum(TreeNode root) {
        maxSum=Integer.MIN_VALUE;
        solve(root);
        return maxSum;
    }
}
