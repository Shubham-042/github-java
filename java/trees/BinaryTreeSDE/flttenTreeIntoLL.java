package trees.BinaryTreeSDE;

public class flttenTreeIntoLL {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    public TreeNode nextRight=null;
    public void flatten(TreeNode root) {
        if(root==null)return;
        flatten(root.right);
        flatten(root.left);

        root.left=null;
        root.right=nextRight;
        nextRight=root;

    }
}
