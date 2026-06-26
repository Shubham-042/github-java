package backTracking;
import java.lang.reflect.Array;
import java.util.*;
public class revision {
    public static boolean isSafe(char[][] board,int row,int col){
        int n=board.length;
        //check row
        for(int j=0; j<n; j++){
            if(board[row][j]=='Q')return false;
        }
        //check colom
        for(int i=0; i<n; i++){
            if(board[i][col]=='Q')return false;
        }
        //northeast
        int i=row;
        int j=col;
        while(i>=0 && j<n){
            if(board[i][j]=='Q')return false;
            i--;
            j++;
        }
        //southwest
        i=row;
        j=col;
        while(i<n && j<n){
            if(board[i][j]=='Q')return false;
            i++;
            j++;
        }
        //southwest
        i=row;
        j=col;
        while(i<n && j>=0){
            if(board[i][j]=='Q')return false;
            i++;
            j--;
        }
        //northwest
        i=row;
        j=col;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q')return false;
            i--;
            j--;
        }
        return true;
    }
    public static void nQueen(char[][] board,int row){
        int n=board.length;
        if(row==n){
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for(int j=0; j<n; j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nQueen(board,row+1);
                board[row][j]='X';
            }
        }
    }
    public static List<List<Integer>> permutations(int[] nums){
        //tc o(n!)
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        boolean[] isValid=new boolean[nums.length];
        helper(nums,ds,isValid,ans);
        return ans;
    }
    public static void helper(int[] nums,List<Integer> ds,boolean[] isValid,List<List<Integer>> ans){
        if(ds.size()==nums.length){
            List<Integer> list=new ArrayList<>();
            for(int i=0; i<ds.size(); i++){
                list.add(ds.get(i));
            }
            ans.add(list);

        }
        for(int i=0; i<nums.length; i++){
            if(isValid[i]==false){
                ds.add(nums[i]);
                isValid[i]=true;
                helper(nums,ds,isValid,ans);
                isValid[i]=false;
                ds.remove(ds.size()-1);
            }
        }
    }
    //permutation method 2
    public static List<List<Integer>> permutations2(int[] nums){
        //tc o(n!)
        List<List<Integer>> ans=new ArrayList<>();
        helper2(nums,0,ans);
        return ans;
    }
    public static void helper2(int[] nums,int idx,List<List<Integer>> ans){
        if(idx==nums.length-1){
            List<Integer> l=new ArrayList<>();
            for(int i=0; i<nums.length; i++){
                l.add(nums[i]);
            }
            ans.add(l);
            return;
        }
        for(int i=idx; i<nums.length; i++){
            swap(i,idx,nums);
            helper2(nums,idx+1,ans);
            //backtracking
            swap(i,idx,nums);
        }
    }
    public static void swap(int i,int j,int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3};
        List<List<Integer>> ans=permutations2(nums);
        System.out.println(ans);

    }
}
