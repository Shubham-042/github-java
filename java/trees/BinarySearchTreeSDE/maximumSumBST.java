package trees.BinarySearchTreeSDE;

public class maximumSumBST {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    int ans;
    //arr->min,max,sum
    public int[] dfs(TreeNode root){
        if(root==null){
            return new int[]{Integer.MAX_VALUE,Integer.MIN_VALUE,0};
        }

        int[] leftSubTree=dfs(root.left);
        int[] rightSubTree=dfs(root.right);

        // valid case of bst
        if(root.val>leftSubTree[1] && root.val<rightSubTree[0]){
            int currSum=leftSubTree[2]+rightSubTree[2]+root.val;
            ans=Math.max(ans,currSum);
            int minVal=Math.min(root.val,leftSubTree[0]);
            int maxVal=Math.max(root.val,rightSubTree[1]);
            return new int[]{minVal,maxVal,currSum};
        }
        int maxSum=Math.max(leftSubTree[2],rightSubTree[2]);

        return new int[]{Integer.MIN_VALUE,Integer.MAX_VALUE,maxSum};
    }
    public int maxSumBST(TreeNode root) {
        ans=0;
        dfs(root);
        return ans;
    }
}
