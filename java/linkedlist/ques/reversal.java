package linkedlist.ques;

public class reversal {
    public static class  Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }

    }
    public static void display(Node head){
        if(head==null) return;
        System.out.print(head.val + " ");
        display(head.next);
    }
    public static Node rev(Node head){
        if(head.next==null) return head;
        Node newHead=rev(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(5);
        Node c=new Node(1);
        Node d=new Node(2);
        Node e=new Node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;
        Node r=rev(a);
        display(r);


    }
}
