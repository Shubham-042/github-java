package DP.dpOn2D;

public class countSquares {
    public int countSquaresLeetcode(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int count=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j]==0)continue;
                if(i>0 && j>0){
                    matrix[i][j]+=Math.min(matrix[i-1][j],Math.min(matrix[i][j-1],matrix[i-1][j-1]));
                }
                count+=matrix[i][j];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] arr={{0,1,1,1},{1,1,1,1},{0,1,1,1}};
//        System.out.println(countSquaresLeetcode(arr));
    }
}
