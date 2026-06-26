public class zzzz {
    public static boolean rev(String s,int low,int high) {
        if(low>=high) return true;
        if(s.charAt(low)==s.charAt(high)){
            return rev(s,low+1,high-1);
        }else return false;
    }
    public static String CASE(String s){
        String ans="";
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                ch=(char)(ch-32);

            }else if(ch>='A' && ch<='Z'){
                ch=(char)(ch+32);

            }
            ans+=ch;

        }
        return ans;

    }
    public static void selection(int[] arr){
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            int minIdx=i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[minIdx]) minIdx=j;
            }
            int temp=arr[i];
            arr[i]=arr[minIdx];
            arr[minIdx]=temp;
        }
    }
    public static void insertion(int[] arr){
        int n=arr.length;
        for(int i=1; i<n; i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void merge(int[] arr,int mid,int l,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int[] left=new int[n1];
        int[] right=new int[n2];
        int i,j,k;
        for( i=0; i<n1; i++)left[i]=arr[l+i];
        for(j=0; j<n2; j++) right[j]=arr[mid+1+j];
        i=0;
        j=0;
        k=l;
        while(i<n1 && j<n2){
            if(left[i]<right[j]) arr[k++]=left[i++];
            else arr[k++]=right[j++];
        }
        while(i<n1) arr[k++]=left[i++];
        while(j<n2) arr[k++]=right[j++];

    }
    public static void mergeSort(int[] arr,int l,int r){
        if(l>=r) return;
        int mid=l+(r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,mid,l,r);
    }
    public static int partition(int[] arr,int l,int r){
        int n=arr.length;
        int pivot=arr[l];
        int i=l+1;
        int j=r;
        while(i<=j){
            while(i<=j  && pivot>arr[i]) i++;
            while( i<=j && pivot<arr[j]) j--;
           if(i<=j){
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               i++;
               j--;
           }
        }
        int temp=arr[l];
        arr[l]=arr[j];
        arr[j]=temp;
        return j;
    }
    public static void quick(int[] arr,int l,int r){
        if(l>=r) return;
        int pi=partition(arr,l,r);
        quick(arr,l,pi-1);
        quick(arr,pi+1,r);
    }

    public static void main(String[] args) {
     float a=0.7f;
     if(a<0.7) System.out.println("hi");
     else System.out.println("bye");



    }
}
