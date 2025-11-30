class ArrayQues{
   void sumOfArray(){
        int[] arr={1,5,3};
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }

       System.out.println(sum);
    }
    void maxEle(){
       int[] arr={1,5,3,43,10};
       int ans=0;
       for(int i=0; i<arr.length; i++){
       if(arr[i]>ans){
           ans=arr[i];
       }
       }
        System.out.println(ans);
    }

    void search(){
       int[] arr={1,5,3,5};
       int ans=-1;
       int x=5;
       for(int i=0; i<arr.length; i++){
           if(arr[i]==x){
               System.out.println(i);
               break;
           }
       }
    }
}
public class quesarray {
    public static void main(String[] args) {
        ArrayQues obj=new ArrayQues();
        obj.sumOfArray();
        obj.maxEle();
        obj.search();
    }
}
