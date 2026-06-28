package binarySearch;

public class medianOfMatrix {
    private int noLesserEle(int[][] mat,int assumeMedian){
        int noLesserEle=0;

        for(int i=0; i<mat.length; i++){
            int low=0;
            int high=mat[0].length-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(mat[i][mid]<=assumeMedian)low=mid+1;
                else high=mid-1;
            }
            noLesserEle+=low;
        }
        return noLesserEle;
    }

    //        MEDIAN OF MATRIX
    public int median(int[][] mat) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            max=Math.max(mat[i][m-1],max);
        }
        int min=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            min=Math.min(min,mat[i][0]);
        }

        int low=min;
        int high=max;
        int N=m*n;
        while(low<=high){
            int assumeMedian=low+(high-low)/2;
            int k=noLesserEle(mat,assumeMedian);

            if(k<=N/2){
                low=assumeMedian+1;
            }else high=assumeMedian-1;
        }
        return low;
    }
}
