package trees.BinaryTreeMiscelleneousSDE;

public class binaryTreeToDLL {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    Node prev=null;
    Node head=null;
    public Node treeToDLL(Node root) {

        if(root==null)return null;
        treeToDLL(root.left);

        if(prev==null)head=root;
        else{
            root.left=prev;
            prev.right=root;
        }
        prev=root;
        treeToDLL(root.right);

        return head;


    }
}
