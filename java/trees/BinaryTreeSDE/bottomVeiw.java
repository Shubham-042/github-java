package trees.BinaryTreeSDE;
import java.util.*;
public class bottomVeiw {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int val) {
            data = val;
            left = right = null;

        }
    }
    class Pair{
        Node node;
        int hd;
        Pair(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> ans=new ArrayList<>();
        Queue<Pair> q=new LinkedList<>();
        TreeMap<Integer,Integer> map=new TreeMap<>();
        q.offer(new Pair(root,0));

        while(q.size()>0){
            Pair curr=q.poll();

            map.put(curr.hd,curr.node.data);

            if(curr.node.left!=null){
                q.offer(new Pair(curr.node.left,curr.hd-1));
            }
            if(curr.node.right!=null){
                q.offer(new Pair(curr.node.right,curr.hd+1));
            }
        }
        for(int val:map.values()){
            ans.add(val);
        }
        return ans;



    }
}
