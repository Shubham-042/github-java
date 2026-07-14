package trees.BinarySearchTree;

public class twoSumBST {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    public boolean findTarget(TreeNode root, int k) {
        BSTIterator l=new BSTIterator(root);
        BSTIterator r=new BSTIterator(root);
        if(root==null)return false;
        int i=l.next();
        int j=r.before();
        while(i<j){
            if(i+j==k)return true;
            else if(i+j<k)i=l.next();
            else j=r.before();
        }
        return false;


    }
}
