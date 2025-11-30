import java.util.Scanner;

public class transpose {
    static void printArray(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] findTranspose(int[][] matrix,int r, int c){
        int[][] ans=new int[c][r];
        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                ans[i][j]=matrix[j][i];
            }
        }
        return ans;
    }
    static void transposeUsingSameMatrix(int[][] matrix,int r,int c){
        for(int i=0; i<c; i++){
            for(int j=i; j<r; j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of rows and columns");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] matrix=new int[r][c];
        int totalElement=r*c;
        System.out.println("enter " + totalElement + " elements" );
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("input matrix");
        printArray(matrix);
        System.out.println("transpose matrix");
//        int[][] ans=findTranspose(matrix,r,c);
//        printArray(ans);
        transposeUsingSameMatrix(matrix,r,c);
        printArray(matrix);
    }
}
