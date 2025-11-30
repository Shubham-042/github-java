package Hashmaps;

import java.util.*;

public class MaxFreq {
    public static void main(String[] args) {
        Map<Integer,Integer> mp=new HashMap<>();
        int[] arr={1,4,2,3,1,1,1,3,};
        for(int el:arr){
            if(!mp.containsKey(el)){
                mp.put(el,1);
            }else{
                mp.put(el,mp.get(el)+1);
            }
        }
        int maxFreq=0,ansKey=-1;
        System.out.println(mp.entrySet());
        for(var e:mp.entrySet()){
            if(e.getValue()>maxFreq){
                maxFreq=e.getValue();
                ansKey=e.getKey();
            }
        }
        System.out.println(ansKey);

    }
}
