package strings.SDESheet;

public class stringToInt {
    public int myAtoi(String s) {
        int n=s.length();
        int i=0;
        int sign=1;
        int num=0;

        //whitespace
        while(i<n && s.charAt(i)==' ')i++;

        //sign
        if(i<n){
            if(s.charAt(i)=='-'){
                sign=-1;
                i++;
            }
            else if(s.charAt(i)=='+')i++;
        }

        // conversion
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)-'0';
            if(num>(Integer.MAX_VALUE-digit)/10){
                return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            num=num*10+digit;
            i++;
        }
        return sign*num;
    }
}
