package strings.SDESheet;

public class repeatedStringMatch {
    public int repeatedString(String a, String b) {
        StringBuilder sb=new StringBuilder(a);
        int count=1;

        while(sb.length()<b.length()){
            sb.append(a);
            count++;
        }

        if(sb.indexOf(b)!=-1)return count;   //it return -1 if b not completely in sb

        sb.append(a);

        if(sb.indexOf(b)!=-1)return count+1;
        return -1;
    }

    //           karp robin
    private final int PRIME=101;
    private double calculateHash(String s){
        double hash=0;
        for(int i=0; i<s.length(); i++){
            hash=hash+s.charAt(i)*Math.pow(PRIME,i);
        }
        return hash;
    }

    private double updateHash(double prevHash,char oldChar,char newChar,int patternLength){
        double newHash=(prevHash-oldChar)/PRIME;
        newHash=newHash+newChar*Math.pow(PRIME,patternLength-1);

        return newHash;
    }
    public boolean search(String pattern,String text){
        int patternLength=pattern.length();
        double patternHash=calculateHash(pattern);
        double textHash=calculateHash(text.substring(0,pattern.length()));

        for(int i=0; i<=text.length()-patternLength; i++){
            if(patternHash==textHash){
                if(text.substring(i,i+patternLength).equals(pattern)){
                    return true;
                }
            }
            if(i<text.length()-patternLength){
                textHash=updateHash(textHash,text.charAt(i),text.charAt(i+patternLength),patternLength);
            }
        }
        return false;
    }
    public int repeatedStringMatch(String a, String b) {
        int count=1;
        StringBuilder sb=new StringBuilder(a);
        while(sb.length()<b.length()){
            sb.append(a);
            count++;
        }


        if(search(b,sb.toString())){
            return count;
        }
        sb.append(a);
        if(search(b,sb.toString())){
            return count+1;
        }

        return -1;
    }


}


