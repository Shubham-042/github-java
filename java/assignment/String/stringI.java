package assignment.String;

public class stringI {
    public class palindrome{
       static  boolean isAlphanumeric(char c){
            return (c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9');
        }
        static char toLower(char c){
            if(c>='A' && c<='Z') return (char)(c+32);
            return c;
        }
        public static boolean palin(String s){
            int n=s.length();
            int i=0;
            int j=n-1;
            while(i<j){
                char left=s.charAt(i);
                char right=s.charAt(j);
                if(!isAlphanumeric(left)) i++;
                else if(!isAlphanumeric(right)) j--;
                else{
                    if(toLower(left)!=toLower(right)) return false;
                    i++;
                    j--;
                }
            }
            return true;
        }
    }
    public static void countVowConsSpace(String s){
        int n=s.length();
        int countVow=0;
        int countCons=0;
        int countSpc=0;

        for(int i=0; i<n; i++){
            char ch=Character.toLowerCase(s.charAt(i));
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') countVow++;
            else if(ch==' ')countSpc++;
            else if(ch>='a' && ch<='z' && !(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'))countCons++;

        }
        System.out.println("vowels :"+ countVow);
        System.out.println("consonent : "+countCons);
        System.out.println("spaces : "+countSpc);
    }
    public static String remChExAlp(String s,String ans){
        int n=s.length();
        for(int i=0; i<n; i++){
            char ch=s.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                ans=ans+ch;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s="Take u C++@#$%aman%&";
        String ans=remChExAlp(s,"");
        System.out.println(ans);

    }
}
