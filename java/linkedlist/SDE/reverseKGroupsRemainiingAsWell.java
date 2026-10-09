package linkedlist.SDE;

public class reverseKGroupsRemainiingAsWell {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public Node reverseKGroup(Node head, int k) {
        if (head == null) return null;

        Node prev = null;
        Node curr = head;
        Node next = null;
        int count = 0;

        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        head.next = reverseKGroup(curr, k);

        return prev;

    }
}
