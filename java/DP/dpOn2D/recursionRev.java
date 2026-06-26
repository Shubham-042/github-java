package DP.dpOn2D;

public class recursionRev {
    private static void subset(String s, String ans){
        if(s.equals("")){
            System.out.print(ans+" ");
            return;
        }
        char ch=s.charAt(0);
        String rem=s.substring(1);
        //pick
        subset(rem,ans+ch);
        //notpick
        subset(rem,ans);

    }
    public static void main(String[] args) {
        String s="abc";
        subset(s,"");
    }
}
