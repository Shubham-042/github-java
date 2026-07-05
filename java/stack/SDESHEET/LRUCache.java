package stack.SDESHEET;
import java.util.*;
public class LRUCache {
    int limit;
    class Node{
        int key;
        int val;
        Node next;
        Node prev;

        Node(int key,int val){
            this.key=key;
            this.val=val;
            next=prev=null;
        }
    }
    Node head=new Node(-1,-1);
    Node tail=new Node(-1,-1);

    HashMap<Integer,Node> map;

    void addNode(Node newNode){
        Node oldNext = head.next;

        newNode.next = oldNext;
        newNode.prev = head;

        head.next = newNode;
        oldNext.prev = newNode;
    }
    void delNode(Node oldNode){
        Node oldPrev=oldNode.prev;
        Node oldNext=oldNode.next;
        //change connections
        oldPrev.next=oldNext;
        oldNext.prev=oldPrev;
    }
    public LRUCache(int capacity) {
        limit=capacity;
        head.next=tail;
        tail.prev=head;
        map=new HashMap<>();
    }

    public int get(int key) {
        if(!map.containsKey(key))return -1;
        Node ansNode=map.get(key);
        map.remove(key);
        delNode(ansNode);
        addNode(ansNode);
        map.put(key,ansNode);

        return map.get(key).val;
    }

    public void put(int key, int val) {
        // if any key already exist then remove that node with new value node
        if(map.containsKey(key)){
            Node oldNode=map.get(key);
            delNode(oldNode);
            map.remove(key);
        }

        //if capacity reached then delete LRU node
        if(map.size()==limit){
            map.remove(tail.prev.key);
            delNode(tail.prev);
        }
        Node newNode=new Node(key,val);
        addNode(newNode);
        map.put(key,newNode);
    }
}
