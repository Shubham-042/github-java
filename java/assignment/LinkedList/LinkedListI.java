package assignment.LinkedList;

public class LinkedListI {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node rightMiddle(Node head){
        //time O(n)
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node leftMiddle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node mergeSortedLinkedlist(Node head1,Node head2){
        // time o(m+n)
        //space o(n+m)
        Node temp1=head1;
        Node temp2=head2;
        Node head=new Node(100);
        Node temp=head;
        while(temp1!=null && temp2!=null){
            if(temp1.data>temp2.data){
                Node a=new Node(temp2.data);
                temp.next=a;
                temp=a;
                temp2=temp2.next;
            }else{
                Node a=new Node(temp1.data);
                temp.next=a;
                temp=a;
                temp1=temp1.next;
            }
        }
        if(temp1==null){
            temp.next=temp2;
        }else temp.next=temp1;
        return head.next;
    }
    public static Node mergeSortedLinkedlistInPlace(Node head1,Node head2){
        //time o(m+n)
        //space o(1)
        Node temp1=head1;
        Node temp2=head2;
        Node head=new Node(100);
        Node temp=head;
        while(temp1!=null && temp2!=null){
            if(temp1.data<temp2.data){
                temp.next=temp1;
                temp=temp1;
                temp1=temp1.next;
            }else{
                temp.next=temp2;
                temp=temp2;
                temp2=temp2.next;
            }
        }
        if(temp1==null){
            temp.next=temp2;
        }else temp.next=temp1;
        return head.next;

    }
    public static Node reverseByRecursion(Node head){
        // time o(n)
        //space o(n)
        if(head.next==null) return head;
        Node newHead=reverseByRecursion(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
    public static Node reverseIterative(Node head){
        //time o(n)
        //space o(n)
        Node prev=null;
        Node curr=head;
        Node agla=null; //next node
        while(curr!=null){
            agla=curr.next;
            curr.next=prev;
            prev=curr;
            curr=agla;
        }
        return prev;
    }
    public static void main(String[] args) {
        Node a=new Node(1);
       Node b=new Node(2);
       Node c=new Node(5);
       Node d=new Node(6);
       Node e=new Node(3);
       Node f=new Node(4);

       a.next=b;
       b.next=c;
       c.next=d;
       d.next=e;
       e.next=f;
       display(a);
       Node ans=reverseByRecursion(a);
       display(ans);


    }
}
