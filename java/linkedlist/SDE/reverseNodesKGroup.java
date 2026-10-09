package linkedlist.SDE;

public class reverseNodesKGroup {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
            next=null;
        }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        int count=0;
        ListNode curr=head;
        while(count<k){
            if(curr==null) return head;
            curr=curr.next;
            count++;
        }

        ListNode prev=reverseKGroup(curr,k);

        count=0;
        curr=head;

        while(count<k){
            ListNode agla=curr.next;
            curr.next=prev;
            prev=curr;
            curr=agla;
            count++;
        }
        return prev;
    }
}
