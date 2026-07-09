package strings.SDESheet;

public class zFunction {
    public static int[] zMatch(String s) {
        int n = s.length();
        int[] z = new int[n];

        int l = 0, r = 0;

        for (int i = 1; i < n; i++) {

            if (i < r) {
                z[i] = z[i - l];

                // Handle case where z[i] goes beyond r
                if (i + z[i] > r) {
                    z[i] = r - i;
                }
            }

            // Extend the match
            while (i + z[i] < n && s.charAt(z[i]) == s.charAt(i + z[i])) {
                z[i]++;
            }

            // Update the Z-box
            if (i + z[i] > r) {
                l = i;
                r = i + z[i];
            }
        }

        return z;
    }

    public static void main(String[] args) {
        String str = "aba$ababbababaaa";

        int[] z = zMatch(str);

        for (int value : z) {
            System.out.print(value + " ");
        }
    }
}
