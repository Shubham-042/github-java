package trees;

public class zigZag {
    public static  class Node{
        int val; // initially 0
        Node left; //initially null
        Node right; // initially null
        public Node(int val){
            this.val=val;
        }
    }
    public static void nthLevel(Node root,int n){ // left to right
        if(root==null) return;
        if(n==1){
            System.out.print(root.val+ " ");
            return;
        }
        nthLevel(root.left,n-1);
        nthLevel(root.right,n-1);
    }
    public static void nthLevel2(Node root,int n){ // right to left
        if(root==null) return;
        if(n==1){
            System.out.print(root.val+ " ");
            return;
        }
        nthLevel2(root.right,n-1);
        nthLevel2(root.left,n-1);
    }
    public static int height(Node root){
        if(root==null || root.left==null && root.right==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
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
       int level=height(root)+1;
       // for zigzag traversal
       for(int i=1; i<=level; i++){
           if(i%2==0) nthLevel2(root,i);
           else nthLevel(root,i);
       }
    }
}
