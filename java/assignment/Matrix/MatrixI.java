package assignment.Matrix;
import java.util.*;

public class MatrixI {
    public static List<Integer> spiralMatrix(int[][] matrix){
        ArrayList<Integer> ans=new ArrayList<>();
        int r=matrix.length;
        int c=matrix[0].length;
        int totalEle=0;
        int tr=0;
        int br=r-1;
        int lc=0;
        int rc=c-1;
        while(totalEle<r*c){
            //top row
            for(int j=lc; j<=rc && totalEle<=r*c; j++){
                ans.add(matrix[tr][j]);
                totalEle++;
            }
            tr++;
            //right col
            for(int i=tr; i<=br && totalEle<=r*c; i++){
                ans.add(matrix[i][rc]);
                totalEle++;
            }
            rc--;
            //bottom row
            for(int j=rc; j>=lc && totalEle<=r*c; j--){
                ans.add(matrix[br][j]);
                totalEle++;
            }
            br--;
            //left col
            for(int i=br; i>=tr && totalEle<=r*c; i--){
                ans.add(matrix[i][lc]);
                totalEle++;
            }
            lc++;
        }
        return ans;
    }
    public static boolean searchMatrix(int[][] matrix,int target){
        // if row and col both are sorted
        //time o(log(m*n))
        int n=matrix.length;
        int m=matrix[0].length;
        int left=0;
        int right=m*n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int midEle=matrix[mid/2][mid%2];
            if(midEle==target)return true;
            else if(midEle<target)left=mid+1;
            else right=mid-1;
        }
        return true;
    }
    public static boolean searchMatrixII(int[][] matrix,int target){
        //if only row is sorted not column
        int r=matrix.length;
        int c=matrix[0].length;
        int i=0;
        int j=c-1;
        while(i<r &&j>=0){
            if(matrix[i][j]==target)return true;
            else if(matrix[i][j]<target)i++;
            else j--;
        }
        return false ;
    }
    public static int[][] sortDiagonally(int[][] mat){
        int m=mat.length;
        int n=mat[0].length;
       Map<Integer,PriorityQueue<Integer>> mp=new HashMap<>();
       for(int i=0; i<m; i++){
           for(int j=0; j<n; j++){
               int key=i-j;
               if(!mp.containsKey(key)){
                   mp.put(key,new PriorityQueue<>());
               }
               mp.get(key).add(mat[i][j]);
           }
       }
       for(int i=0; i<m; i++){
           for(int j=0; j<n; j++){
               int key=i-j;
               mat[i][j]=mp.get(key).poll(); //by default pq poll smallest
           }
       }
       return mat;
    }

}
