package graphs;
import java.lang.reflect.Array;
import java.util.*;

public class kosarajuAlogo {
    static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void creratGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));
        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(2,1));
        graph[3].add(new Edge(3,4));


    }
    public static void topSort(ArrayList<Edge> graph[],int curr,boolean[] vis,Stack<Integer> st){
        vis[curr]=true;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                topSort(graph,e.dest,vis,st);
            }
        }
        st.push(curr);

    }
    public static void dfs(ArrayList<Edge> graph[],int curr,boolean[] vis){
        vis[curr]=true;
        System.out.print(curr+" ");
        for(int i=0 ;i<graph[curr].size(); i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph,e.dest,vis);
            }
        }
    }
    public static void kosaraju(ArrayList<Edge> graph[],int V){
        //step1
        Stack<Integer> st=new Stack<>();
        boolean[] vis=new boolean[V];
        for(int i=0; i<V; i++){
            if(!vis[i]){
                topSort(graph,i,vis,st);
            }
        }
        //step2
        ArrayList<Edge> transpose[]=new ArrayList[V];

        for(int i=0; i<transpose.length; i++){
            vis[i]=false;
            transpose[i]=new ArrayList<>();

        }
        for(int i=0; i<V; i++){
            for(int j=0; j<graph[i].size();j++){
                Edge e =graph[i].get(j); //e.src->e.dest
                transpose[e.dest].add(new Edge(e.dest,e.src));

            }
        }
        //step3
        while(!st.isEmpty()){
         int curr=st.pop();
         if(!vis[curr]){
             dfs(transpose,curr,vis);
             System.out.println();
         }

        }
    }

    public static void main(String[] args) {
        int V=5;
        ArrayList<Edge> graph[]=new ArrayList[V];
        creratGraph(graph);
    kosaraju(graph,V);
    }
}
