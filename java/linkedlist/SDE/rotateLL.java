package linkedlist.SDE;

public class rotateLL {
    public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    private int size(ListNode head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)return head;
        int n=size(head);
        if(n==0)return null;
        ListNode curr=head;
        k=k%n;
        if(k==0)return head;
        for(int i=0; i<n-k-1; i++){
            curr=curr.next;
        }
        ListNode temp=curr.next;
        ListNode newHead=temp;
        curr.next=null;
        while( temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        return newHead;


    }
}
