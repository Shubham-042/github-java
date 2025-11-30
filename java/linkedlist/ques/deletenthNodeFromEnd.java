package linkedlist.ques;

public class deletenthNodeFromEnd {

        public static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
            }


            public static Node deleteNthNodeFromEnd(Node head, int n) {
                Node slow = head;
                Node fast = head;
                for (int i = 1; i <= n; i++) {
                    fast = fast.next;
                }
                if (fast == null) {
                    head = head.next;
                    return head;
                }
                while (fast.next != null) {
                    slow = slow.next;
                    fast = fast.next;
                }
                slow.next = slow.next.next;
                return head;
            }
            
        }

            public static void main(String[] args) {
                nthNodeFromEnd.Node a=new nthNodeFromEnd.Node(100);
                nthNodeFromEnd.Node b=new nthNodeFromEnd.Node(13);
                nthNodeFromEnd.Node c=new nthNodeFromEnd.Node(4);
                nthNodeFromEnd.Node d=new nthNodeFromEnd.Node(5);
                nthNodeFromEnd.Node e=new nthNodeFromEnd.Node(12);
                nthNodeFromEnd.Node f=new nthNodeFromEnd.Node(10);
                a.next=b;
                b.next=c;
                c.next=d;
                d.next=e;
                e.next=f;
                f.next=null;
            }
        }
