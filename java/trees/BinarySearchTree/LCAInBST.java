package trees.BinarySearchTree;

public class LCAInBST {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p==root || q==root)return root;
        if(p==q)return p;
        boolean leftP=(root.val>p.val)?true:false;
        boolean rightq=(root.val<q.val)?true:false;

        if((leftP && rightq) || (!leftP && !rightq)) return root;
        else if(leftP && !rightq)return lowestCommonAncestor(root.left,p,q);
        else return lowestCommonAncestor(root.right,p,q);
    }
}
