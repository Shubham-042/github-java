package trees.BinaryTreeSDE;

public class treeFromPreAndInorder {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    public TreeNode solve(int[] preorder,int[] inorder,int st,int end,int idx){
        if(st>end)return null;

        int rootVal=preorder[idx];
        int i=st;
        for(; i<=end; i++){
            if(inorder[i]==rootVal) break;
        }
        idx++;
        TreeNode root=new TreeNode(rootVal);
        root.left=solve(preorder,inorder,st,i-1,idx);
        root.right=solve(preorder,inorder,i+1,end,idx);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length;
        int idx=0;
        return solve(preorder,inorder,0,n-1,idx);
    }
}
