package trees.BinaryTreeSDE;

public class symmetricTree {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    private boolean isSame(TreeNode p,TreeNode q){
        if(p==null && q==null)return true;
        if(p==null || q==null)return false;
        if(p.val!=q.val)return false;
        return isSame(p.left,q.left) && isSame(p.right,q.right);
    }
    private TreeNode invert(TreeNode root){
        if(root==null)return root;
        TreeNode temp=root.left;
        root.left=invert(root.right);
        root.right=invert(temp);
        return root;
    }
    public boolean isSymmetric(TreeNode root) {
        root.right=invert(root.right);
        return isSame(root.left,root.right);
    }



    //                                                 OR
    private boolean help(TreeNode left,TreeNode right){
        if(left==null || right==null)return left==right;
        if(left.val!=right.val)return false;
        return help(left.left,right.right) && help(left.right,right.left);
    }
    public boolean isSymmetricII(TreeNode root) {
        return root==null || help(root.left,root.right);
    }
}
