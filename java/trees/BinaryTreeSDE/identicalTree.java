package trees.BinaryTreeSDE;

public class identicalTree {
    class TreeNode{
        int val;
        TreeNode right;
        TreeNode left;
        TreeNode(int val){
            this.val=val;
        }
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q!=null)return false;
        if(q==null && p!=null)return false;
        if(p==null && q==null)return true;
        if(p.val==q.val){
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }else return false;
    }
}
