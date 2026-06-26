package assignment.LinkedList;

public class LinkedListII {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
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
    public static Node evenodd(Node head){
        Node odd=new Node(0); //dummy
        Node even=new Node(0); //dummy
        Node tempo=odd;
        Node tempe=even;
        Node temp=head;
        while(temp!=null){
            tempo.next=temp;
            temp=temp.next;
            tempo=tempo.next;

            tempe.next=temp;
            if(temp==null)break;
            temp=temp.next;
            tempe=tempe.next;
        }
        tempo.next=even.next;
        return odd.next;
    }
    public static Node addTwonumber(Node head1,Node head2){
        Node dummy=new Node(0);
        Node curr=dummy;
        int carry=0;
        while(head1!=null || head2!=null){
            int sum=carry;
            if(head1!=null){
                sum+=head1.data;
                head1=head1.next;
            }
            if(head2!=null){
                sum+=head2.data;
                head2=head2.next;
            }
            carry=sum/10;
            curr.next=new Node(sum%10);
            curr=curr.next;
        }
        if(carry>0){
            curr.next=new Node(carry);
            curr=curr.next;
        }
        return dummy.next;
    }
    public static Node removeDuplicateSortedList(Node head){
        Node prev=head;
        Node temp=head.next;
        if(head==null)return null;
        if(head.next==null)return head;
        while(temp!=null){
            if(prev.data!=temp.data){
                prev.next=temp;
                prev=temp;
                temp=temp.next;
            }
            else temp=temp.next;
        }
        prev.next=null;
        return head;
    }
    public static Node skipAllDuplicates(Node head){
        Node dummy=new Node(0);
        dummy.next=head;
        Node prev=dummy;
        Node curr=head;
        while(curr!=null){
            if(curr.next!=null && curr.data==curr.next.data){
                int duplicate=curr.data;
                while(curr!=null && curr.data==duplicate){
                    curr=curr.next;
                }
                prev.next=curr;
            }else{
                prev=curr;
                curr=curr.next;
            }
        }
        return dummy.next;
    }
    public static Node rotate(Node head,int k){
        Node curr=head;
        int n=1;
        while(curr.next!=null){
            n++;
            curr=curr.next;
        }
        k=k%n;
        if(k==0)return head;
        curr.next=head;
        curr=head;
        for(int i=0; i<n-k-1; i++){
            curr= curr.next;
        }
        head=curr.next;
        curr.next=null;
        return head;
    }
    public static void main(String[] args) {
        Node a=new Node(1);
       Node b=new Node(2);
       Node c=new Node(2);
       Node d=new Node(3);
       Node e=new Node(3);
       Node f=new Node(6);

       a.next=b;
       b.next=c;
       c.next=d;
       d.next=e;
       e.next=f;
       display(a);
       display(rotate(a,2));

    }
}
