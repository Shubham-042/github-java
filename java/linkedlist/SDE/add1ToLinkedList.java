package linkedlist.SDE;

public class add1ToLinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public Node addOne(Node head) {
        Node notNine=head;
        Node end=head;

        while(end.next!=null){
            end=end.next;
            if(end.data!=9){
                notNine=end;
            }


        }
        if(notNine==head && notNine.data==9){
            Node  newHead=new Node(1);
            newHead.next=head;
            while(notNine!=null){
                notNine.data=0;
                notNine=notNine.next;
            }
            return newHead;
        }
        if(notNine==end){
            end.data=end.data+1;
            return head;
        }

        notNine.data=notNine.data+1;
        notNine=notNine.next;
        while(notNine!=null){
            notNine.data=0;
            notNine=notNine.next;
        }
        return head;
    }
}
