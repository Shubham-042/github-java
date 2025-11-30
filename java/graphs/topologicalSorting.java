package graphs;
import java.util.*;
public class topologicalSorting {
    static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            this.src=s;
            this.dest=d;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i]=new ArrayList<Edge>();
        }

        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(4,2));
    }
    static void topSortUtil(ArrayList<Edge> graph[], int curr,boolean[] vis,Stack<Integer> st){
        vis[curr]=true;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]) topSortUtil(graph,e.dest,vis,st);
        }
        st.push(curr);

    }
    static void topSort(ArrayList<Edge> graph[], int v){
        boolean[] vis=new boolean[v];
        Stack<Integer> st=new Stack<>();
        for(int i=0; i<v; i++){
            if(!vis[i]){
                topSortUtil(graph,i,vis,st);
            }

        }
        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
    }
    public static void main(String[] args) {
        int v=6;
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph);
        topSort(graph,v);


    }
}
