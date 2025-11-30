package stack;

public class implementationByLinkedList {
    public static class Node{ //user defined data type
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class Stack{ //ueser defined data structure
        private Node head= null;
        private int size=0;
        void push(int x){
        Node temp=new Node(x);
        temp.next=head;
        head=temp;
        size++;
        }
        int pop(){
            if(size()==0){
                System.out.println("Stack is empty ");
                return -1;
            }
            int x=head.val;
            head=head.next;
            return x;
        }
        void displayRecursion(Node h){
            if(h==null) return;
            displayRecursion(h.next);
            System.out.print(h.val + " ");
        }
        void display(){ //helper fucntion
            displayRecursion(head);
            System.out.println();
        }
        void displayRev(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.val + " ");
                temp=temp.next;
            }
            System.out.println();
        }
        int size(){
            return size;
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);

        st.display();
    }
}
