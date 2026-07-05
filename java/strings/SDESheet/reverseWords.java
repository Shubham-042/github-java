package strings.SDESheet;

public class reverseWords {
    //             T.C O(n)

    private String rev(String s){
        String s1=s.trim();
        String ans=new StringBuilder(s1).reverse().toString();
        System.out.println(ans);
        return ans;
    }
    public String reverseWords(String s) {
        String s1=s.trim();
        String res="";
        int st=0;
        for(int end=0; end<s1.length(); end++){
            if(end==s1.length()-1){
                String ans=rev(s1.substring(st,end+1));
                res+=ans;
            }
            if(s1.charAt(end)==' ' && s1.charAt(end+1)!=' '){
                String ans=rev(s1.substring(st,end));
                res+=ans+" ";
                st=end;
            }
        }
        return rev(res);
    }


    //                 T.C O(n)
    public String reverseWordsOptimise(String s) {

        //         "\\s+" split if one or more whitespace char...
        String[] words=s.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=words.length-1; i>=0; i--){
            sb.append(words[i]);
            if(i!=0)sb.append(" ");
        }
        return sb.toString();
    }
}
