package DSU;

 public class DisjoinSet {
    int[] parent;
    int[] rank;

    public DisjoinSet(int n) {
        parent = new int[n];
        rank = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    //find func which is used to find the parent (top parent) by recursion
    public int find(int x) {
        if (parent[x] == x) return x;

        parent[x] = find(parent[x]);
        return parent[x];

    }

    //union by rank
    public void union(int a, int b) {
        int parA = find(a);
        int parB = find(b);

        // if already in the same set
        if (parA == parB) return;

        if (rank[parA] == rank[parB]) {
            parent[parB] = parA;
            rank[parA]++;
        } else if (rank[parA] > rank[parB]) {
            parent[parB] = parA;
        } else {
            parent[parA] = parB;
        }
    }
}

     class Main{
        public static void main(String[] args) {
            DisjoinSet ds=new DisjoinSet(7);
            ds.union(1,2);
            ds.union(2,3);
            ds.union(4,5);
            ds.union(6,5);
            ds.union(3,5);

            if(ds.find(1)==ds.find(6)){
                System.out.println("Same Set");
            }else{
                System.out.println("Different Set");
            }

        }
    }


