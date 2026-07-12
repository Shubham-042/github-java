package trees.BinaryTreeSDE;

public class morrisPreorder {
    static class   Node{
        int val;
        Node right;
        Node left;
        Node(int val){
            this.val=val;
        }
    }
    public static Node findPreorderPredessosor(Node curr){
        Node pp=curr.left;
        while(pp.right!=null && pp.right!=curr){
            pp=pp.right;
        }
        return pp;
    }
    public static void  preOrder(Node root){
        Node curr=root;
        while(curr!=null) {
            if (curr.left == null) {
                System.out.print(curr.val + " ");
                curr = curr.right;
            } else {
                Node pp = findPreorderPredessosor(curr);

                if (pp.right == null) {
                    pp.right = curr; // create thread
                    System.out.print(curr.val + " ");
                    curr = curr.left;
                } else {
                    pp.right = null; //delete thread

                    curr = curr.right;
                }
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);

        root.left=a;
        root.right=b;
        b.left=c;
        b.right=d;
        preOrder(root);
    }
}
