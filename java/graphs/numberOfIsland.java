package graphs;

public class numberOfIsland {
    public static void dfs(int i,int j,char[][] grid){
        if(grid==null || grid.length==0)return;
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]=='0')return;
        grid[i][j]='0'; // visit that pos by converting '1' -> '0'
        dfs(i+1,j,grid);
        dfs(i,j+1,grid);
        dfs(i-1,j,grid);
        dfs(i,j-1,grid);
    }
    public static void main(String[] args) {
        int count=0;
        char[][] grid={{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
        boolean[][] isVis=new boolean[4][5];
        for(int i=0; i<4; i++){
            for(int j=0; j<5; j++){
                if(grid[i][j]=='1' ){
                    count++;
                    dfs(i,j,grid);
                }
            }
        }
        System.out.println(count);
    }
}
