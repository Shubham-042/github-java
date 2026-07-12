package trees.BinaryTreeSDE;
import java.util.*;
public class zigZagTraversal {
    class TreeNode{
                        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)return res;
        boolean leftToRight=true;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(q.size()>0){
            int size=q.size();
            List<Integer> ans=new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode curr=q.poll();
                if(leftToRight)ans.addLast(curr.val);
                else ans.addFirst(curr.val); //for reverse
                if(curr.left!=null)q.offer(curr.left);
                if(curr.right!=null)q.offer(curr.right);
            }
            res.add(ans);
            leftToRight=!leftToRight;

        }
        return res;
    }
}
