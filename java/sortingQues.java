public class sortingQues {
    static void moveZeroes(int[] arr){
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    static void sortFruits(String[] fruits){
        int n=fruits.length;
        for(int i=0; i<n-1; i++){
            int min_index=i;
            for(int j=i+1; j<n; j++){
                if(fruits[j].compareTo(fruits[min_index])<0){
                    min_index=j;
                }
            }
            String temp=fruits[min_index];
            fruits[min_index]=fruits[i];
            fruits[i]=temp;
        }

    }
    public static void main(String[] args) {
//        int[] arr={0,5,0,3,4,2};
//        moveZeroes(arr);
//        for(int i:arr){
//            System.out.print(i + " ");
//        }

        String[] fruits={"papaya","lime","watermelon","apple","mango","kiwi"};
        sortFruits(fruits);
        for(String val:fruits){
            System.out.print(val + " ");
        }
    }
}
