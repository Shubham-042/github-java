package trees.BinarySearchTreeSDE;

public class kthLargestBST {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }

public int count;
public int ans;


public void dfs(TreeNode root,int k){
    if(root==null || ans!=-1)return;
    dfs(root.right,k);


    count++;
    if(count==k){
        ans=root.val;
        return;
    }
    dfs(root.left,k);

}
public int kthLargestGFG(TreeNode root, int k) {
    count=0;
    ans=-1;

    dfs(root,k);

    return ans;

}
}