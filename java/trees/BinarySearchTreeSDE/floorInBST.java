package trees.BinarySearchTreeSDE;

public class floorInBST {
    class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }
    public int findMaxFork(Node root, int k) {
        Node curr=root;
        int ans=-1;
        while(curr!=null){
            if(curr.data==k)return curr.data;
            else if(curr.data<=k){
                ans=curr.data;
                curr=curr.right;
            }else{

                curr=curr.left;
            }
        }
        return ans;
    }
}
