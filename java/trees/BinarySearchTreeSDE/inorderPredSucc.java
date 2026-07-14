package trees.BinarySearchTreeSDE;
import java.util.*;
public class inorderPredSucc {

    class Node {
        int data;
        Node left, right;
        Node(int x) {
            data = x;
            left = right = null;
        }
    }
    public Node rightMostLeftTree(Node root){
        Node ans=null;
        while(root!=null){
            ans=root;
            root=root.right;
        }
        return ans;
    }
    public Node leftMostRightTree(Node root){
        Node ans=null;
        while(root!=null){
            ans=root;
            root=root.left;
        }
        return ans;
    }
    public ArrayList<Node> findPreSuc(Node root, int key) {
        ArrayList<Node> ans=new ArrayList<>();
        Node curr=root;
        Node pred=null;
        Node succ=null;
        while(curr!=null){
            if(key<curr.data){
                succ=curr;
                curr=curr.left;
            }else if(key>curr.data){
                pred=curr;
                curr=curr.right;
            }else{
                if(curr.left!=null){
                    //inorder pred
                    pred=rightMostLeftTree(curr.left);

                }
                if(curr.right!=null){
                    //inorder succ
                    succ=leftMostRightTree(curr.right);

                }
                break;
            }
        }
        ans.add(pred);
        ans.add(succ);
        return ans;

    }
}
