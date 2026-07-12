package trees.BinaryTreeSDE;
import java.util.*;
public class verticalOrderTraversal {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    class Triplet{
        int row;
        int col;
        TreeNode node;
        Triplet(int col,int row,TreeNode node){
            this.row=row; //row->level
            this.col=col;  //col->horizontal dist
            this.node=node;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
        Queue<Triplet> q=new LinkedList<>();
        q.offer(new Triplet(0,0,root));
        while(q.size()>0){
            Triplet curr=q.poll();
            map.computeIfAbsent(curr.col,k->new TreeMap<>()).computeIfAbsent(curr.row,k->new PriorityQueue<>()).offer(curr.node.val);

            if(curr.node.left!=null)q.offer(new Triplet(curr.col-1,curr.row+1,curr.node.left));
            if(curr.node.right!=null)q.offer(new Triplet(curr.col+1,curr.row+1,curr.node.right));

        }
        for(TreeMap<Integer,PriorityQueue<Integer>> m:map.values()){
            List<Integer> list=new ArrayList<>();
            for(PriorityQueue<Integer> pq:m.values()){
                while(pq.size()>0){
                    list.add(pq.poll());
                }
            }
            ans.add(list);
        }
        return ans;
    }
}
