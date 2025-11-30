package oops;
import java.util.*;

public class arraylist {
    public static class Arraylist{
        int[] arr=new int[2];
        int idx=0;
        int size=0;
        public void add(int ele){
            if(size==arr.length){
                int[] brr=Arrays.copyOf(arr,arr.length*2);
              arr=brr;
            }
            arr[idx++]=ele;
            size++;
        }
        public void set(int idx,int val){
            arr[idx]=val;
        }
    }
    public static void main(String[] args) {
    Arraylist arr=new Arraylist();
    arr.add(2);
    arr.add(4);
    arr.add(5);
    arr.add(7);
        System.out.println(arr.size);
        arr.set(2,10);

    }
}
