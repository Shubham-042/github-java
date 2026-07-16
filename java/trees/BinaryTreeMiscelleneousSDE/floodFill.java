package trees.BinaryTreeMiscelleneousSDE;

public class floodFill {
    private void dfs(int[][] image,int i,int j,int originalCol,int newColor){
        int n=image.length;
        int m=image[0].length;
        if(i<0 || j<0 || i>=n || j>=m || image[i][j]==newColor || image[i][j]!=originalCol)return;

        image[i][j]=newColor;
        dfs(image,i-1,j,originalCol,newColor); //top
        dfs(image,i+1,j,originalCol,newColor); //bottom
        dfs(image,i,j-1,originalCol,newColor);  //right
        dfs(image,i,j+1,originalCol,newColor);  //left

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        dfs(image,sr,sc,image[sr][sc],color);
        return image;
    }
}
