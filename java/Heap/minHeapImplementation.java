package Heap;
import java.util.*;
class Heap{
    private int idx=1;
    private int[] arr;
   int peek(){
       return arr[1];
   }

   void add(int ele) {
       arr[idx++] = ele;

       //rearrangement
       int root = idx - 1;
       while (root != 1) {
           int parent = root / 2;
           if (arr[root] < arr[parent]) {
               int temp = arr[root];
               arr[root] = arr[parent];
               arr[parent] = temp;
               root = parent;
           } else break;
       }
   }
   int remove(){
       if(idx==1) System.out.println("empty heap");

       int min=arr[1];

       arr[1]=arr[idx-1];
       idx--;

       //rearrangement
       int root=1;
       while(root<size()){
           int left=2*root; int right=2*root+1;
           int leftVal=(left<=size())?arr[left]:Integer.MAX_VALUE;
           int rightVal=(right<=size())?arr[right]:Integer.MAX_VALUE;
           if(arr[root]<leftVal && arr[root]<rightVal) break;
           else{
                if(leftVal<rightVal){ //left child se swap krna hai
                    int temp=arr[root];
                    arr[root]=arr[left];
                    arr[left]=temp;
                    root=left;
                }else{
                    //right child se swap krna hai
                    int temp=arr[root];
                    arr[root]=arr[right];
                    arr[right]=temp;
                    root=right;
                }
           }
       }
       return min;
   }
       void display(){
           for(int i=1; i<idx; i++){
               System.out.print(arr[i]+" ");
           }
           System.out.println();

   }

   int size(){
       return idx-1;
   }


    Heap(int capacity){
        arr=new int[capacity+1];
        Arrays.fill(arr,Integer.MAX_VALUE);
    }
}
public class minHeapImplementation {
    public static void main(String[] args) {
        Heap h=new Heap(10);
        h.add(10); h.add(15);  h.add(8);  h.add(9);  h.add(4);
        h.display();
        System.out.println(h.remove());
        h.add(2);
        h.display();

    }
}
