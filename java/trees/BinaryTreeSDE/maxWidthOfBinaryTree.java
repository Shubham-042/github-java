package trees.BinaryTreeSDE;
import java.util.*;
public class maxWidthOfBinaryTree {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    class Pair{
        long idx;
        TreeNode node;
        Pair(TreeNode node,long idx){
            this.node=node;
            this.idx=idx;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        int max=0;
        Deque<Pair> dq=new LinkedList<>();
        dq.offer(new Pair(root,0));

        while(dq.size()>0){
            int size=dq.size();
            long stIdx=dq.peekFirst().idx;
            long enIdx=dq.peekLast().idx;
            max=Math.max(max,(int)(enIdx-stIdx+1));

            for(int i=0; i<size; i++){
                Pair curr=dq.poll();

                if(curr.node.left!=null)dq.offer(new Pair(curr.node.left,curr.idx*2+1));
                if(curr.node.right!=null)dq.offer(new Pair(curr.node.right,curr.idx*2+2));

            }
        }
        return max;
    }
}
