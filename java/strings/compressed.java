package strings;

public class compressed {
    //ques
    // input : aaaabbbcccccd
    //output : a4b3c4d
    public static void main(String[] args) {
        String str="aaaabbbcccccdde";
        String ans="" + str.charAt(0); //a
        int count=1;
        for(int i=1; i<str.length(); i++){
            char curr=str.charAt(i);
            char prev=str.charAt(i-1);
            if(curr==prev) {
                count++;
            }else{
                if(count>1) ans+=count;
                ans+=curr;
                count=1;
            }
        }
        if(count>1) ans+=count;
        System.out.println(ans);
    }
}
