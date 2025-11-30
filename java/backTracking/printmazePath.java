package backTracking;

public class printmazePath {
    private static  void print(int sr,int sc, int er, int ec,String s){ //sr-starting row sc-starting coloumn
        //er-ending row ec-ending coloumn
        if(sr>er ||sc>ec) return ;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        //gp down
        print(sr+1,sc,er,ec,s+"D");
        //go right
        print(sr,sc+1,er,ec,s+"R");
    }
    public static void main(String[] args) {
        int rows=3;
        int cols=3;
        print(0,0,rows-1,cols-1,"");

    }
}
