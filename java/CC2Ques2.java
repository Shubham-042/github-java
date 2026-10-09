public class CC2Ques2 {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
            left=right=null;
        }
    }
    public static int sum(Node head){
        if(head==null)return 0;
        int take=head.val;


        if(head.left!=null)take+=sum(head.left.left)+sum(head.left.right);
        if(head.right!=null)take+=sum(head.right.left)+sum(head.right.right);

        int skip=sum(head.left)+sum(head.right);
        return Math.max(skip,take);
    }

    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(3);
        Node c=new Node(2);
        Node d=new Node(1);
        Node e=new Node(4);
        Node f=new Node(7);
        Node g=new Node(8);
        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;
        c.left=f;
        d.left=g;

        System.out.println(sum(a));
    }
}
