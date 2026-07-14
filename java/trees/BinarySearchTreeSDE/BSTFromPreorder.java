package trees.BinarySearchTreeSDE;

public class BSTFromPreorder {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    public int idx;
    public TreeNode build(int[] pre,int bound){
        if(idx>=pre.length || pre[idx]>bound) return null;

        TreeNode root=new TreeNode(pre[idx++]);
        root.left=build(pre,root.val);
        root.right=build(pre,bound);
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        idx=0;
        return build(preorder,Integer.MAX_VALUE);
    }
}
