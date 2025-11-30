public class BubbleSort {
    static void bubble(int[] arr){
        int n=arr.length;
        //n-1 iterations/passes
        for(int i=0; i<n-1; i++){
            boolean flag=false;
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(flag==false){
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={5,7,4,3,1};
        bubble(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
