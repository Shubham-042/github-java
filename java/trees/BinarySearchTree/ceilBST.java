package trees.BinarySearchTree;

public class ceilBST {
    class Node {
        int data;
        Node left, right;

        Node(int val) {
            this.data = val;
            left = right = null;
        }
    }
    int findCeil(Node root, int x) {
        Node curr=root;
        int ans=-1;
        while(curr!=null){
            if(curr.data==x)return curr.data;
            else if(curr.data>=x){
                ans=curr.data;
                curr=curr.left;
            }else{
                curr=curr.right;
            }
        }
        return ans;

    }
}
