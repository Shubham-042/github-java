package Hashmaps;
import java.util.*;
public class hashMapImplementation {
    static class MyHashMap<K , V> {
        public static final int DEFAULT_CAPACITY=4;
        public static final float DEFAULT_LOAD_FACTOR=0.75f;
        private class Node{
            K key;
            V value;
            Node(K key, V value){
                this.key=key;
                this.value=value;
            }
        }
        private LinkedList<Node>[] buckets;  // Array of LinkedList
        private void initbuckets(int N){ // N : capacity/size of bucket
         buckets=new LinkedList[N];
         for(int i=0; i<buckets.length; i++){

         }
        }
        public MyHashMap(){
         initbuckets(DEFAULT_CAPACITY);
        }

        public int size(){
        return 1;
        }

        public int put(K key,V value){
        return 1;
        }


    }
    public static void main(String[] args) {
        MyHashMap<String,Integer> mp=new MyHashMap<>();
    }
}
