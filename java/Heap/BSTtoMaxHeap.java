package Heap;
import java.util.*;
public class BSTtoMaxHeap {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
        }
    }
    public static int idx;
    public static  void inOrder(Node root,ArrayList<Integer> in){
        if(root==null)return;
        inOrder(root.left,in);
        in.add(root.data);
        inOrder(root.right,in);
    }
    public static void postOrder(Node root,ArrayList<Integer> in){
        if(root==null)return;
        postOrder(root.left,in);
        postOrder(root.right,in);

        root.data=in.get(idx++);
    }
    public static void convertToMaxHeapUtil(Node root) {
        // code here
        idx=0;
        ArrayList<Integer> in=new ArrayList<>();
        inOrder(root,in);
        postOrder(root,in);

    }
}
