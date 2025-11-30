package stack.interviewQues;

public class nextGreaterElement {
    public static int[] remove(int[] arr){
        int n=arr.length;
        int[] res=new int[n];

        for(int i=0; i<n;i++){
            res[i]=-1;//imp
            for(int j=i+1; j<n; j++){

                if(arr[i]<arr[j]){
                    res[i]=arr[j];
                    break;
                }
            }


        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={1,3,2,1,8,6,3,4};
        int[] res=remove(arr);
        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+ " ");
        }

    }
}
