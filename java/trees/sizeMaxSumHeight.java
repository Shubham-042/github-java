package trees;

public class sizeMaxSumHeight {
    public static  class Node{
        int val; // initially 0
        Node left; //initially null
        Node right; // initially null
        public Node(int val){
            this.val=val;
        }
    }
    public static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.val+ " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+ " ");
        inorder(root.right);
    }
    public static void postOrder(Node root){
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }

    public static int size(Node root){
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    public static int max(Node  root){
        if(root==null) return Integer.MIN_VALUE;
        int a=max(root.left);
        int b=max(root.right);

        return Math.max(root.val,Math.max(a,b));
    }
    public static int height(Node root){
        if(root==null || root.left==null && root.right==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public static int sum(Node root){
        if(root==null) return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    public static int product(Node root){
        if(root==null) return 1;
        return root.val*product(root.left)*product(root.right);
    }
    public static void nthLevel(Node root,int n){
        if(root==null) return;
        if(n==1){
            System.out.print(root.val+ " ");
            return;
        }
        nthLevel(root.left,n-1);
        nthLevel(root.right,n-1);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        root.left=a;
        root.right=b;
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(6);
        a.left=c;
        a.right=d;
        b.right=e;
        System.out.println();
        System.out.println(size(root));
        System.out.println(sum(root));
        System.out.println(max(root));
        System.out.println(height(root));
        System.out.println(product(root));
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        int level=height(root)+1;
        for(int i=1; i<=level; i++){
            nthLevel(root,i);
        }
    }
}
