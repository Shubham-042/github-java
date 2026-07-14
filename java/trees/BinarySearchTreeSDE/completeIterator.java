package trees.BinarySearchTreeSDE;

import java.util.*;
class BSTIterator {
    public BSTIterator(twoSumBST.TreeNode root) {
    }

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    Stack<TreeNode> st;
    Stack<TreeNode> bef;
    public BSTIterator(TreeNode root) {
        st=new Stack<>();
        bef=new Stack<>();
        storeLeft(root);
        storeRight(root);
    }
    void storeLeft(TreeNode root){
        while(root!=null){
            st.push(root);
            root=root.left;
        }
    }
    void storeRight(TreeNode root){
        while(root!=null){
            bef.push(root);
            root=root.right;
        }
    }

    public int next() {
        TreeNode  ans=st.pop();

        storeLeft(ans.right);

        return ans.val;
    }
    public int before(){
        TreeNode ans=bef.pop();
        storeRight(ans.left);
        return ans.val;
    }

    public boolean hasNext() {
        if(st.size()>0)return true;
        else return false;
    }
    public boolean hasBefore() {
    return !bef.isEmpty();

}
}