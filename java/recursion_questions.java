import java.util.ArrayList;
import java.util.Scanner;

public class recursion_questions {
    //ques1
    static int fact(int n){
        if(n==0){

            return 1;
        }
        int factN=n*fact(n-1);
        return factN;

    }
    //ques2
    static int fib(int n){
        if(n==0 || n==1){
            return n;
        }

       return  fib(n-1)+fib(n-2);

    }
    //ques3
    static int sumOfDigits(int n){
        if(n>=0 && n<=9)
            return n;
        return sumOfDigits(n/10)+n%10;
    }
    static int pow(int p, int q){
        if(q==0){
            return 1;
        }
        return pow(p,q-1)*p;
    }
    //ques4
    static int powM2(int p, int q){
        if(q==0) return 1;
        if(q%2==0) return powM2(p,q/2)*powM2(p,q/2);
        else return p*powM2(p,q/2)*powM2(p,q/2);
    }
//    ques5
    static void printMultiple(int n,int k){
       if(k==1){
           System.out.println(n);
           return;
       }
       printMultiple(n,k-1);
        System.out.println(n*k);
        return ;
    }
    //ques6
    static int seriesSum(int n){
        if(n==0) return 0;
        if(n%2==0) return seriesSum(n-1)-n;
        else return seriesSum(n-1)+n;
    }
   static int GCD(int x, int y){
        while(x%y!=0){
            int rem=x%y;
            x=y;
            y=rem;
        }
        return y;
   }
   //GCD by recursion
    static int GCDrec(int x, int y){
        if(y==0){
            return x;
        }
        return GCDrec(y,x%y);
    }
    //ques 8
    static void printArray(int[] arr,int idx){
        int n=arr.length;

       if(idx==n){
           return;
       }
        System.out.println(arr[idx]);
        printArray(arr,idx+1);
    }
    //ques 9
    static int maxVal(int[] arr, int idx){
        int n=arr.length;
        if(idx==n-1){
            return arr[idx];
        }
        return Math.max(arr[idx],maxVal(arr,idx+1));
    }
    //ques 10
    static int sum(int[] arr,int idx){
        int n=arr.length;
        if(idx==n) return 0;

        return arr[idx]+sum(arr,idx+1);
    }
    //ques11
    static boolean linearSearch(int[] arr,int target, int idx){
        int n=arr.length;
        if(idx==n) return false;
        if(arr[idx]==target) return true;
        return linearSearch(arr,target,idx+1);
    }
    //ques 12
    static void findAllIndices(int[] arr, int target, int idx){
        if(idx>=arr.length) return;
        if(arr[idx]==target) System.out.println(idx);
        findAllIndices(arr,target,idx+1);

    }
//    ques 13
    static ArrayList<Integer> allIndices(int[] arr,int target, int idx){
        if(idx>=arr.length){
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> ans=new ArrayList<>();
        if(arr[idx]==target){
            ans.add(idx);
        }
        ArrayList<Integer> smallAns=allIndices(arr,target,idx+1);
        ans.addAll(smallAns);
        return ans;
    }
    //ques 13
    static String removeA(String s, int idx){
        if(idx==s.length()) return "";
        String smallAns=removeA(s,idx+1);
        char currChar=s.charAt(idx);
        if(currChar!='a'){
            return currChar+smallAns;
        } else return smallAns;
    }
    //ques14
    static String reverseString(String s, int idx){
        if(idx==s.length()) return "";
        return reverseString(s,idx+1)+s.charAt(idx);
    }

    //ques15
    static boolean palindrome(String s, int l, int r){
        if(l>=r) return true;
        return (s.charAt(l)==s.charAt(r) && palindrome(s,l+1,r-1));
    }

    //ques16
    static ArrayList<String> subsequences(String s){
        ArrayList<String> ans=new ArrayList<>();
        //base case
        if(s.length()==0){
            ans.add("");
            return ans;
        }
        char curr=s.charAt(0);
        ArrayList<String> smallAns=subsequences(s.substring(1));
        for(String ss: smallAns){
            ans.add(ss);
            ans.add(curr+ss);
        }
        return ans;
    }
    //ques 17
    static void printSSQ(String s, String currAns){
        if(s.length()==0){
            System.out.println(currAns);
            return;
        }
        char curr= s.charAt(0);
        String remString = s.substring(1);
        //curr char -> chooses to be part of currAns
        printSSQ(remString,currAns+curr);
        //curr char -> does not chooses to be part of currAns
        printSSQ(remString,currAns);
    }
    //ques 18
    static void subsetSum(int[] a,int n, int idx,int sum){
        if(idx>=n){
            System.out.println(sum);
            return;
        }
        //curr idx+ curee ans
        subsetSum(a,n,idx+1,sum+a[idx]);
        //curr ans
        subsetSum(a,n,idx+1,sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter n ");
//        int n=sc.nextInt();
//        int ans=fact(n);
//        System.out.println(ans);
//        System.out.println("FIBONACCI UPTO Nth TERM");
//        for(int i=0; i<=n; i++){
//            System.out.println(fib(i));
//        }


//        System.out.println("sum of digits is "+sumOfDigits(n));

//        ques3,4
//        int p=sc.nextInt();
//        int q= sc.nextInt();
//        System.out.println(pow(p,q));
//        System.out.println(powM2(p,q));

        //ques5
//        System.out.println("enter n and k ");
//        int n=sc.nextInt();
//        int k=sc.nextInt();
//        printMultiple(n,k);

        //ques6
//        System.out.println("enter n ");
//        int n=sc.nextInt();
//        System.out.println(seriesSum(n));

        //GCD
//        System.out.println("Enter x and y ");
//        int x=sc.nextInt();
//        int y=sc.nextInt();
//        System.out.println("GCD is " +GCDrec(x,y));

        //ques 8
//        System.out.println("enter no. of element ");
//        int n=sc.nextInt();
//        System.out.println("enter elements ");
//        int[] arr=new int[n];
//        for(int i=0; i<arr.length; i++){
//            arr[i]=sc.nextInt();
//        }
//        System.out.println("enter index from which u want to print ");
//        int idx=sc.nextInt();
//       printArray(arr,idx);

        //ques 9
//        System.out.println("enter no. of element ");
//        int n=sc.nextInt();
//        System.out.println("enter elements ");
//        int[] arr=new int[n];
//        for(int i=0; i<arr.length; i++){
//            arr[i]=sc.nextInt();
//        }
//        System.out.println("enter index  ");
//        int idx=sc.nextInt();
//       int max=maxVal(arr,idx);
//        System.out.println("max " +max);

//        //ques10
//        int[] arr={1,2,3,4,5,6,7,8};
//        int idx=0;
//        System.out.println("sum is " + sum(arr,idx));

        //ques11
//        int[] arr={4,12,54,14,3,8,6,1};
//        int target=4;
//        if(linearSearch(arr,target,0))
//            System.out.println("yes");
//        else System.out.println("no");

        //ques 12
//        int[] arr={1,2,3,2,2,4};
//        int target=2;
//        findAllIndices(arr,target,0);

        //ques 13
//        int[] arr={1,2,4,4,5,4};
//        int target =4;
//        ArrayList<Integer> ans=allIndices(arr,target,0);
//        for(Integer i : ans){
//            System.out.println(i);
//    }

        //ques13
//        String s=sc.nextLine();
//        System.out.println(removeA(s,0));

        //ques14
//        String s=sc.nextLine();
//        System.out.println(reverseString(s,0));

        //ques15
//        System.out.println("enter string ");
//        String s=sc.nextLine();
//        int n=s.length();
//        System.out.println(palindrome(s,0,n-1));

        //ques16
//        ArrayList<String> ans=subsequences("abc");
//        for(String ss:ans){
//            System.out.println(ss);
//        }

        //ques17
//        printSSQ("abc","");

        //ques 17
        int[] a={2,4,5};
        subsetSum(a,a.length,0,0);
    }
}
