package Hashmaps.HashMapQues;

import java.util.HashMap;

public class largestSubarrayZeroSum {
    public int subArray(int[] arr,int n){
        HashMap<Integer,Integer> mp=new HashMap<>();
        int maxLen=0,preSum=0;
        mp.put(0,-1);
        for(int i=0; i <n; i++){
            preSum+=arr[i];
            if(mp.containsKey(preSum)){
                maxLen=Math.max(maxLen,i-mp.get(preSum));
            }else{
                mp.put(preSum,i);

            }
        }
        return maxLen;
    }
}
