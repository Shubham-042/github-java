
import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
//        Integer i=Integer.valueOf(4);
//        System.out.println(i);
//        Float f=Float.valueOf(4.5f);
//        System.out.println(f);
        ArrayList<Integer> l1=new ArrayList<>();
        //add new element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        //get element at index 1
//        System.out.println(l1.get(1));

        //print with for loop
//        for(int i=0; i<l1.size(); i++){
//            System.out.println(l1.get(i));
//        }

        //printing the array directly
        System.out.println(l1);

        //adding element at some index
        l1.add(1,100);
        System.out.println(l1);

        //modifying an element at index i
        l1.set(1,10);
        System.out.println(l1);

         //removing an element at index i
        l1.remove(1);
        System.out.println(l1);

        // removing an element e by its value
        l1.remove(Integer.valueOf(7));
        System.out.println(l1);

        //checking if an element exists
        boolean ans=l1.contains(Integer.valueOf(6));
        System.out.println(ans);

        //if you don't specify class , you can put anything inside l
        ArrayList l=new ArrayList();
        l.add("hello");
        l.add(true);
        l.add(1);
        System.out.println(l);

    }

}
