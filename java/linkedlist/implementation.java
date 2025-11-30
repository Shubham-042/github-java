package linkedlist;

public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{
    Node head=null;
    Node tail=null;
    int size=0;
    void insertAtEnd(int val){
        Node temp=new Node(val);
        if(head==null){
            head=temp;
        }
        else {
            tail.next = temp;
        }
        tail = temp;
        size++;
    }
    void insertAtHead(int val){
        Node temp=new Node(val);
        if(head==null){
            head=tail=temp;
        }
        else{
            temp.next=head;
            head=temp;
        }
        size++;
    }
        void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
            System.out.println(); //for next line
        }

        void insertAt(int idx, int val){
        Node t=new Node( val);
        Node temp=head;
        if(idx==size){
            insertAtEnd(val);
            return;
        }
        else if(idx==0){
            insertAtHead(val);
            return;
        }
        for(int i=1; i<=idx-1; i++){
            temp=temp.next;
        }
        t.next=temp.next;
        temp.next=t;
        size++;
        }

        int getAt(int idx){
        Node temp=head;
        for(int i=1; i<=idx; i++){
            temp=temp.next;
        }
        return temp.data;
        }
        void deleteAt(int idx){
        if(idx==0){
            head=head.next;
            size--;
            return;
        }
        Node temp=head;
        for(int i=1; i<=idx-1; i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        tail=temp;
        size--;
    }
    }

    public static void main(String[] args) {
    linkedlist ll=new linkedlist();
    ll.insertAtEnd(2);
    ll.insertAtEnd(5);
    ll.insertAtEnd(5);
    ll.insertAtEnd(6);
    ll.display();
        ll.insertAtHead(9);// 9->2->5->6
        ll.display();
        ll.insertAt(2,10); //9->2->10->5->6
        ll.display();
        System.out.println(ll.getAt(2)); //10
        ll.deleteAt(2);
        ll.display();
    }
}
