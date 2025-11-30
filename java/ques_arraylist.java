import java.util.ArrayList;
import java.util.Collections;

public class ques_arraylist {
    static void reverseArrayList(ArrayList<Integer> list){
        int i=0, j=list.size()-1;
        while(i<j){
            Integer temp=Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;

        }
    }
    public static void main(String[] args) {
//        ArrayList<Integer> list=new ArrayList<>();
//        list.add(0);
//        list.add(10);
//        list.add(3);
//        list.add(5);
//        list.add(22);
//        list.add(10);
//        System.out.println("original list "+ list);
//        reverseArrayList(list);    //inBuild method Collections.reverse(list);
//         System.out.println("reverse list " + list);

//        ques sort arraylist of strings

        ArrayList<String> str=new ArrayList<>();
        str.add("Welcome");
        str.add("To");
        str.add("Java");
        str.add("Programming");
        System.out.println("original " + str);
        Collections.sort(str);
        System.out.println("sorted ascend " + str);
        Collections.sort(str,Collections.reverseOrder());
        System.out.println("sorted descend " + str);

    }
}
