package backTracking;

public class mazePath {
    private static  int maze(int sr,int sc, int er, int ec){ //sr-starting row sc-starting coloumn
        //er-ending row ec-ending coloumn
        if(sr>er ||sc>ec) return 0;
        if(sr==er && sc==ec) return 1;
        int downWays=maze(sr+1,sc,er,ec);
        int rightWays=maze(sr,sc+1,er,ec);
        int totalWays=downWays+rightWays;
        return totalWays; //2
    }
    public static void main(String[] args) {
        int rows=2;
        int cols=2;
        int count=maze(1,1,rows,cols);
        System.out.println(count);
    }
}
