import java.util.Scanner;

public class spiralMatrix {
    static void printMatrix(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
//    QUES1
    static void spiralOrder(int[][] matrix,int r, int c){
        int topRow=0, bottomRow=r-1, rightColumn=c-1,leftColumn=0;
        int curr=0;
        while(curr< r*c){
            // topRow->leftColumn to rightColoum
            for(int j=leftColumn; j<=rightColumn && curr< r*c; j++){
                System.out.print(matrix[topRow][j] + " ");
                curr++;
            }
            topRow++;
            //rightColumn->topRow to bottomRow
            for(int i=topRow; i<=bottomRow && curr< r*c; i++){
                System.out.print(matrix[i][rightColumn] + " ");
                curr++;
            }
            rightColumn--;
            //bottomRow-> rightColumn to leftColumn
            for(int j=rightColumn; j>=leftColumn && curr< r*c; j--){
                System.out.print(matrix[bottomRow][j] + " ");
                curr++;
            }
            bottomRow--;
            //leftColumn->bottomRow to topRow
            for(int i=bottomRow; i>=topRow && curr< r*c; i--){
                System.out.print(matrix[i][leftColumn] + " ");
                curr++;
            }
            leftColumn++;
        }
    }


//    QUES2
static int[][] generateSpiralMatrix(int n){
    int topRow=0, bottomRow=n-1, rightColumn=n-1,leftColumn=0;
    int[][] matrix=new int[n][n];
    int curr=1;
    while(curr<=n*n){
        // topRow->leftColumn to rightColoum
        for(int j=leftColumn; j<=rightColumn && curr<=n*n; j++){
            matrix[topRow][j]=curr++;
        }
        topRow++;
        //rightColumn->topRow to bottomRow
        for(int i=topRow; i<=bottomRow && curr<n*n; i++){
            matrix[i][rightColumn]=curr++;
        }
        rightColumn--;
        //bottomRow-> rightColumn to leftColumn
        for(int j=rightColumn; j>=leftColumn && curr<n*n; j--){
            matrix[bottomRow][j]=curr++;
        }
        bottomRow--;
        //leftColumn->bottomRow to topRow
        for(int i=bottomRow; i>=topRow && curr< n*n; i--){
            matrix[i][leftColumn]=curr++;
        }
        leftColumn++;
    }
    return matrix;
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        ques1
//        System.out.println("enter the no. of rows and columns which is same");
//        int r=sc.nextInt();
//        int c=sc.nextInt();
//        int[][] matrix=new int[r][c];
//        int curr=r*c;
//        System.out.println("enter " + curr + " elements" );
//        for(int i=0; i<r; i++){
//            for(int j=0; j<c; j++){
//                matrix[i][j]=sc.nextInt();
//            }
//        }
//        System.out.println("input matrix");
//        printMatrix(matrix);
//        System.out.println("spiral printing");
//        spiralOrder(matrix,r,c);

//        ques2
        System.out.println("enter n");
        int n=sc.nextInt();
        int[][] matrix=generateSpiralMatrix(n);
        printMatrix(matrix);
    }
}
