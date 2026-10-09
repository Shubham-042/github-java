package linkedlist.SDE;

public class sort0s1s2s {
    class Node {
        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }}
    public Node segregate(Node head) {
        // code here
        if(head.next==null)return head;
        Node zero=new Node(-1);
        Node one=new Node(-1);
        Node two=new Node(-1);
        Node curr=head;
        Node o=one;
        Node z=zero;
        Node t=two;
        while(curr!=null){
            if(curr.data==0){
                z.next=curr;
                z=z.next;
            }else if(curr.data==1){
                o.next=curr;
                o=o.next;
            }else{
                t.next=curr;
                t=t.next;
            }
            curr=curr.next;
        }

        z.next=(one.next!=null)?one.next:two.next;
        o.next=two.next;
        t.next=null;
        return zero.next;
    }
}
