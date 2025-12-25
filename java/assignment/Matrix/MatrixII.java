package assignment.Matrix;

public class MatrixII {
        public static int findLesserEle(int[][] mat,int assumeMed){
            int noOfLesserEle=0;
            for(int i=0; i<mat.length; i++){
                int st=0,end=mat[0].length-1;
                while(st<=end){
                    int mid=st+(end-st)/2;
                    if(mat[i][mid]<=assumeMed)st=mid+1;
                    else end=mid-1;
                }
                noOfLesserEle+=st;
            }
            return noOfLesserEle;
        }
        public static int medianRowWiseSortedMatrix(int[][] mat){
            //time o(mlogn)
            int m=mat.length;
            int n=mat[0].length;
            int N=m*n;
            int st=0,end=2000;
            while(st<=end){
                int assumeMed=st+(end-st)/2;
                int k=findLesserEle(mat,assumeMed);
                if(k<=N/2)st=assumeMed+1;
                else end=assumeMed-1;
            }
            return st;
        }
        public static int[] rowWithMax1(int[][] mat){
            int m=mat.length;
            int n=mat[0].length;
            int rowIdx=0;
            int maxCount=0;
            for(int i=0; i<m; i++){
                int count=0;
                for(int j=0; j<n; j++){
                    if(mat[i][j]==1)count++;

                }
                if(count>maxCount){
                    maxCount=count;
                    rowIdx=i;
                }
            }
            return new int[]{rowIdx,maxCount};
        }
        public static void transpose(int[][] mat){
            int m=mat.length;
            int n=mat[0].length;
            for(int i=0; i<m; i++){
                for(int j=i; j<n; j++){
                    if(i!=j){
                        int temp=mat[i][j];
                        mat[i][j]=mat[j][i];
                        mat[j][i]=temp;
                    }
                }
            }
        }
        public static void reverse(int[] arr){
            int n=arr.length;
            int i=0, j=n-1;
            while(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        public static void rotateBy90(int[][] mat){
            //time O(n^2)
            int m=mat.length;
            int n=mat[0].length;
            transpose(mat);
            for(int i=0; i<m; i++){
                reverse(mat[i]);
            }
        }
    public static void main(String[] args) {
      int[][] mat={{1,5,7,9,11},{2,3,4,5,10},{9,10,12,14,16}};
        System.out.println(medianRowWiseSortedMatrix(mat));
    }
}
