package linkedlist;

public class basicLn {
    public static class Node{
        int data;
        Node next;
        Node(int data){
           this.data=data;
        }
    }
    static void display(Node head){
        if(head==null) return;
        System.out.print(head.data);
        display(head.next);
    }
    public static int length(Node a){
        int count=0;
        while(a!=null){
            count++;
            a=a.next;
        }
        return count;
    }

    public static void main(String[] args) {
    Node a=new Node(5);
    Node b=new Node(3);
    Node c=new Node(9);
    Node d=new Node(8);
    a.next=b; // a ke next mai ba ka address daldo 
    b.next=c;
    c.next=d;
//    Node temp=a;
//        for(int i=1; i<=4; i++){
//            System.out.println(temp.data);
//            temp=temp.next;
//        }
//        while(temp!=null){
//            System.out.print(temp.data + " ");
//            temp=temp.next;
//        }
//        display(a); //by recursion
        int length=length(a);
        System.out.println(length);

    }
}
