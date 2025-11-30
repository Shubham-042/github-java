package HashSet;

import java.util.HashSet;

public class basics {
    public static void main(String[] args) {
        HashSet<String> st=new HashSet<>();
        st.add("James");
        st.add("Scott");
        st.add("James"); //hashset is unique so double element not stores
        System.out.println(st);
        System.out.println(st.contains("James"));
        System.out.println(st.size());
    }
}
