package Hashmaps;

import java.util.*;

public class basic {
    static void hashmaps(){
        Map<String,Integer> mp=new HashMap<>();
        mp.put("Aman",12);
        mp.put("Shubham",13);
        mp.put("Akash",15);
        mp.put("Harry",18);
        System.out.println(mp.get("Aman"));
        System.out.println(mp.get("Shubham"));
        System.out.println(mp);
        mp.put("Aman",11); //updating
        System.out.println(mp);
        System.out.println(mp.get("priya")); //null
        System.out.println(mp.remove("Harry")); //18
        System.out.println(mp);
        System.out.println(mp.remove("nitin"));//null
        System.out.println(mp.containsKey("Aman"));
        mp.putIfAbsent("Ram",1);
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        System.out.println(mp.entrySet()); // [Aman=11. Akash=15, Shubham=13, Ram=1]

        //traversing
        //method 1
        for(String key: mp.keySet()){
            System.out.printf("Age of %s is %d\n",key,mp.get(key));
        }
        System.out.println();
        //method 2
        for(Map.Entry<String,Integer> e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }
        System.out.println();
        //method 3
        for(var e: mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getValue(),e.getValue());
        }
    }
    public static void main(String[] args) {
        hashmaps();
    }
}
