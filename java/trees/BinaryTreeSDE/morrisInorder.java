package trees.BinaryTreeSDE;

public class morrisInorder {
    static class   Node{
        int val;
        Node right;
        Node left;
        Node(int val){
            this.val=val;
        }
    }
    public static  Node findInorderPredessosor(Node curr){
        Node ip=curr.left;
        while(ip.right!=null && ip.right!=curr){
            ip=ip.right;
        }
        return ip;
    }
    public  static void inorder(Node root){
        Node curr=root;
        while(curr!=null){
            if(curr.left==null){
                System.out.print(curr.val+" ");
                curr=curr.right;
            }
            else{
                Node ip=findInorderPredessosor(curr);
                if(ip.right==null){
                    ip.right=curr; // create thread
                    curr=curr.left;
                }else{
                    ip.right=null; //delete thread
                    System.out.print(curr.val+" ");
                    curr=curr.right;
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
        inorder(root);

    }
}
