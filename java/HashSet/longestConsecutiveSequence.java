package HashSet;

import java.util.HashSet;

public class longestConsecutiveSequence {
    public int longestConsecutive(int[] nums){
        HashSet<Integer> st=new HashSet<>();
        int maxStreek=0;
        for(int num : nums) st.add(num);

        for(int num : st){
            if(!st.contains(num-1)){ // num is starting point of the sequence
                int currNum=num;
                int currStreek=1; //length of current consecutive sequence
                while(st.contains(currNum+1)){
                    currStreek++;
                    currNum++;
                }
                maxStreek=Math.max(maxStreek,currStreek);
            }

        }
        return maxStreek;
    }
}
