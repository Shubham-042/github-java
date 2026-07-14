package trees.BinarySearchTree;

public class kthSmallestBST {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    public int count;
    public int ans=-1;
    public void dfs(TreeNode root,int k){
        if(root==null || ans!=-1)return;

        dfs(root.left,k);
        if(ans!=-1)return;
        count++;
        if(count==k){
            ans=root.val;
            return;
        }
        dfs(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        count=0;
        dfs(root,k);
        return ans;
    }
}
