import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class bucketSort {
    static void printArray(float[] arr){
        for(float val : arr){
            System.out.print(val + " ");
        }
    }
    static void bucketSort(float[] arr){
        int n=arr.length;
        //Buckets
        ArrayList<Float>[] buckets=new ArrayList[n];
        //create empty buckets
        for(int i=0; i<n; i++){
            buckets[i] = new ArrayList<Float>();
        }
        //add elements into our buckets
        for(int i=0; i<n; i++){
            int bucketIndex=(int)arr[i]*n;
            buckets[bucketIndex].add(arr[i]);
        }
        //sort each buckets
        for(int i=0; i< buckets.length; i++){
            Collections.sort(buckets[i]);
        }
        //merge all buckets individually
        int index=0;
        for(int i=0; i< buckets.length; i++){
            ArrayList<Float> currBucket=buckets[i];
            for(int j=0; j< currBucket.size(); j++){
                arr[index++]= currBucket.get(j);
            }
        }
    }

    public static void main(String[] args) {
        float[] arr={.2f,.45f,.01f,.56f};
        bucketSort(arr);
        printArray(arr);
    }
}
