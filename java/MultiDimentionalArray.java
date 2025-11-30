import java.util.Scanner;

public class MultiDimentionalArray {
    static void printArray(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void add(int[][] a,int r1, int c1, int[][] b, int r2, int c2){
        if(r1 != r2 || c1 != c2){
            System.out.println("wrong input-addition not possible");
            return;
        }
        int[][] sum=new int[r1][c1];
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        printArray(sum);
    }
    static void multiply(int[][] a,int r1,int c1, int[][] b,int r2,int c2){
        if(c1 != r2){
            System.out.println("multiplication not possible-wrong dimentioms");
            return;

        }
        int[][] mul=new int[r1][c2];
        for(int i=0; i<r1; i++){
            for(int j=0; j<c2; j++){
                for(int k=0; k<c1; k++){
                    mul[i][j]+=(a[i][k]*b[k][j]);
                }
            }
        }
        System.out.println("multiplication of two matrices");
        printArray(mul);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter no. of rows");
//        int r=sc.nextInt();
//        System.out.println("Enter no. of column");
//        int c=sc.nextInt();
//       int[][] arr=new int[r][c];
//        System.out.println("Enter " + r*c + " elements");
//        for(int i=0; i<r; i++){
//            for(int j=0; j<c; j++){
//                arr[i][j]=sc.nextInt();
//            }
//        }
//        printArray(arr);

//        addition
        System.out.println("Enter no. of row and no. of column of first matrix");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int[][] a =new int[r1][c1];
        System.out.println("enter elements");
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
               a[i][j]=sc.nextInt();
           }
       }
        System.out.println("Enter no. of row and no. of column of second matrix");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int[][] b=new int[r2][c2];
        System.out.println("enter elements");
        for(int i=0; i<r2; i++){
            for(int j=0; j<c2; j++){
                b[i][j]=sc.nextInt();
            }
        }
//        System.out.println("sum of matrix a and matrix b is ");
//        add(a,r1,c1,b,r2,c2);
        multiply(a,r1,c1,b,r2,c2);
    }
}
