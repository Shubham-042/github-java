package trees.BinarySearchTree;

public class validateBST {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }

    public boolean helper(TreeNode root,long minBound,long maxBound){
        if(root==null)return true;
        if(root.val<=minBound || root.val>=maxBound)return false;
        return helper(root.left,minBound,root.val) && helper(root.right,root.val,maxBound);
    }
    public boolean isValidBST(TreeNode root) {
        return helper(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
}
