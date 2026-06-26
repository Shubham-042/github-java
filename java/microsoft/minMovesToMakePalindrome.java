package microsoft;

public class minMovesToMakePalindrome {
    public void swap(char[] arr,int i,int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int minMovesToMakePalindrome(String s) {
        char[] arr=s.toCharArray();
        int left=0;
        int right=arr.length-1;
        int swaps=0;
        while(left<right){
            if(arr[left]==arr[right]){
                left++;
                right--;
            }else{
                int k=right;
                while(k>left && arr[k]!=arr[left]){
                    k--;
                }
                if(k==left){
                    swap(arr,left,left+1);
                    swaps++;
                }else{
                    while(k<right){
                        swap(arr,k,k+1);
                        swaps++;
                        k++;
                    }
                    left++;
                    right--;
                }

            }
        }
        return swaps;
    }
}
