package trees.BinaryTreeSDE;
import java.util.*;
public class rightSideView {
    class   TreeNode{
        int val;
        TreeNode right;
        TreeNode left;
        TreeNode(int val){
            this.val=val;
        }
    }
    //                    DFS
    void dfs(TreeNode root,int level,List<Integer> ans){
        if(root==null)return;
        if(level==ans.size())ans.add(root.val);

        // travel right subtree first
        dfs(root.right,level+1,ans);
        dfs(root.left,level+1,ans);
    }
    public List<Integer> rightSideViewDFS(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        dfs(root,0,ans);
        return ans;
    }



    //                      BFS
    public List<Integer> rightSideViewBFS(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null)return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(q.size()>0){
            int size=q.size();

            for(int i=0; i<size; i++){
                TreeNode curr=q.poll();
                if(i==size-1)ans.add(curr.val);
                if(curr.left!=null)q.offer(curr.left);
                if(curr.right!=null)q.offer(curr.right);
            }
        }
        return ans;
    }
}
