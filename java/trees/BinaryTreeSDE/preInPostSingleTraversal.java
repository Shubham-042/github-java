package trees.BinaryTreeSDE;
import java.util.*;
public class preInPostSingleTraversal {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
            right=left=null;
        }
    }
    static class Pair{
        int num;
        Node node;
        Pair(Node node,int num){
            this.node=node;
            this.num=num;
        }
    }
    public static void  solve(Node root,List<List<Integer>> ans){

        List<Integer> pre=new ArrayList<>();
        List<Integer> in=new ArrayList<>();
        List<Integer> post=new ArrayList<>();
        Stack<Pair> st=new Stack<>();
        st.push(new Pair(root,1));
        while(st.size()>0){
            Pair curr=st.pop();
            if(curr.num==1){
                pre.add(curr.node.val);
                curr.num++;
                st.push(curr);

                if(curr.node.left!=null)st.push(new Pair(curr.node.left,1));
            }else if(curr.num==2){
                in.add(curr.node.val);
                curr.num++;
                st.push(curr);
                if(curr.node.right!=null)st.push(new Pair(curr.node.right,1));
            }else{
                post.add(curr.node.val);
            }
        }
        ans.add(pre);
        ans.add(in);
        ans.add(post);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);

        root.left = n2;
        root.right = n3;

        n2.left = n4;
        n2.right = n5;

        n3.left = n6;
        n3.right = n7;
        List<List<Integer>> ans=new ArrayList<>();
        solve(root,ans);
        System.out.println(ans);

    }
}
