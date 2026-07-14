package trees.BinarySearchTreeSDE;
import java.util.*;
public class populatingNextPointerI {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;



        public Node(int _val) {
            val = _val;
        }


    }
    public Node connect(Node root) {
        if(root==null)return null;
        Queue<Node> q=new LinkedList<>();
        q.offer(root);

        while(q.size()>0){
            int size=q.size();
            for(int i=0; i<size; i++){
                Node curr=q.poll();
                if(i!=size-1)curr.next=q.peek();


                if(curr.left!=null)q.offer(curr.left);
                if(curr.right!=null)q.offer(curr.right);
            }
        }
        return root;
    }


    //                                    OR
    public Node connectOptimise(Node root) {
        if(root==null)return null;

        Node leftMost=root;
        while(leftMost.left!=null){
            Node curr=leftMost;
            while(curr!=null){
                curr.left.next=curr.right;
                if(curr.next!=null){
                    curr.right.next=curr.next.left;
                }
                curr=curr.next;
            }
            leftMost=leftMost.left;
        }
        return root;
    }
}
