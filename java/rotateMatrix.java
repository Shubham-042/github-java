import java.util.Scanner;

public class rotateMatrix {
    static void printMarix(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
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
    static void reverseArray(int[] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void rotateMatrix90degree(int[][] matrix,int n){
           //transpose
        transposeUsingSameMatrix(matrix,n,n);
        //reverse rows
        for(int i=0; i<n; i++) {
            reverseArray(matrix[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of rows and columns which is same");
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
        printMarix(matrix);
        System.out.println("after rotation");
        rotateMatrix90degree(matrix,r);
        printMarix(matrix);
    }
}
