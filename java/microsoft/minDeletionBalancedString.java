package microsoft;

public class minDeletionBalancedString {
    public static int minDel(String s){
        int op=0;
        int countY=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='Y')countY++;
            else op=Math.min(op+1,countY);
        }
        return op;
    }
    public static void main(String[] args) {
        String s="YXXXYXY";
        System.out.println(minDel(s));
    }
}
