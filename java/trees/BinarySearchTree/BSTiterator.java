package trees.BinarySearchTree;
import java.util.*;
public class BSTiterator {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    public Stack<TreeNode> st;
    public BSTiterator(TreeNode root) {
        st=new Stack<>();
        storeLeft(root);
    }
    void storeLeft(TreeNode root){
        while(root!=null){
            st.push(root);
            root=root.left;
        }
    }

    public int next() {
        TreeNode  ans=st.pop();

        storeLeft(ans.right);

        return ans.val;
    }

    // for before ... apply reverse inorder dfs

    public boolean hasNext() {
        if(st.size()>0)return true;
        else return false;
    }
}
