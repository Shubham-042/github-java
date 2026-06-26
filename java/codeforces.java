import java.util.*;

public class codeforces {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            String[] answers = {
                    "Walk",
                    "No",
                    "No",
                    "No",
                    "Yes",
                    "Yes",
                    "backwards",
                    "7"
            };

            System.out.println(answers[n - 1]);
        }

}