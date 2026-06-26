package assignment.LinkedList;

import java.util.LinkedList;

public class LinkedListIntro {
    public static class Node{
        int data;
        Node next;
        Node(int val){
            this.data=val;
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
    public static  class linkedList{
        Node head=null;
        Node tail=null;
        int size=0;
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }


        void insertAtEnd(int val){
            Node temp=new Node(val);

            if(head==null){
                head=temp;
            }else{
                tail.next=temp;
            }
            tail=temp;
            size++;
        }
        void insertAtbeg(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
            }else{
                temp.next=head;
            }
            head=temp;
            size++;
        }
        void insertAtIdx(int idx,int val){
            Node t=new Node(val);
            Node temp=head;
            if(idx==0){
                insertAtbeg(val);
            }
            else if(idx==size){
                insertAtEnd(val);
            }else{
                for(int i=1; i<=idx-1; i++){
                    temp=temp.next;
                }
                t.next=temp.next;
                temp.next=t;
            }
            size++;
        }
        int getAt(int idx){
            Node temp=head;
            for(int i=1; i<=idx-1; i++){
                temp=temp.next;
            }
            return temp.data;
        }
        void deleteAt(int idx){
           if(idx<0 || idx>=size){
               System.out.println(" wrong input: ");
               size--;
               return;
           }
           if(idx==0){
               head=head.next;
               size--;
               return;
           }
           Node temp=head;
           for(int i=0; i<idx; i++){
               temp=temp.next;
           }
           if(temp.next==tail) tail=temp;
           temp.next=temp.next.next;
           size--;

        }
    }
    public static void deleteNodeItself(Node a){
        a.data=a.next.data;
        a.next=a.next.next;
    }
    public static Node search(Node head,int target){
        Node temp=head;
        while(temp!=null){
            if(temp.data==target){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    public static void main(String[] args) {
       Node a=new Node(1);
       Node b=new Node(2);
       Node c=new Node(3);
       Node d=new Node(4);
       Node e=new Node(5);

       a.next=b;
       b.next=c;
       c.next=d;
       d.next=e;

       display(a);


    }
}
