package trees.BinaryTreeSDE;

public class diameter {
    class TreeNode{
        int val;
        TreeNode right;
        TreeNode left;
        TreeNode(int val){
            this.val=val;
        }
    }
    public int level(TreeNode root,int dia){
        if(root==null)return 0;
        int leftLevel=level(root.left,dia);
        int rightLevel=level(root.right,dia);
        int path=leftLevel+rightLevel;
        dia=Math.max(dia,path);
        return 1+Math.max(leftLevel,rightLevel);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int dia=0;
        level(root,dia);
        return dia;
    }

}
