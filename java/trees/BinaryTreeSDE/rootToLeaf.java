package trees.BinaryTreeSDE;
import java.util.*;
public class rootToLeaf {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public void dfs(Node root,ArrayList<Integer> curr,ArrayList<ArrayList<Integer>> ans){
        if(root==null)return;
        curr.add(root.data);
        if(root.left==null && root.right==null){

            ans.add(new ArrayList<>(curr));


        }else{
            dfs(root.left,curr,ans);

            dfs(root.right,curr,ans);
        }


        curr.remove(curr.size()-1);
    }
    public ArrayList<ArrayList<Integer>> Paths(Node root) {

        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        dfs(root,new ArrayList<>(),ans);
        return ans;
    }
}
