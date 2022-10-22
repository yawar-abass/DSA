package Graphs;

import java.util.ArrayList;
// Graph Representation -- > Adjacency list ,Adjacency Matrix
public class Graph {
    //     Graph
    //  (0)----(1)
    //   |    / |  \
    //   |   /  |   (2)
    //   |  /   |  /
    //  (4)----(3)

    static int V =5;
    int E = 10;
    static int [][] adjMat = new int[V+1][V+1];

    static void addEdgeMat(int source, int dest){
        adjMat[source][dest] =1;
        adjMat[dest][source] =1;

    }
    public static void main(String[] args) {
        // Using Adjacency Matrix

      /*  addEdgeMat(0,1);
        addEdgeMat(0,4);
        addEdgeMat(1,4);
        addEdgeMat(1,3);
        addEdgeMat(2,1);
        addEdgeMat(2,3);
        addEdgeMat(3,4);
        System.out.println(" Adjacency Matrix");
        for (int i = 0; i < adjMat.length; i++) {
            for (int j = 0; j < adjMat[i].length; j++) {
                System.out.print(adjMat[i][j]+ " ");
            }
            System.out.println();
        } */

        // Using Adjacancy List
        int v =5;
        ArrayList<ArrayList<Integer>> adj  = new ArrayList<>(v);
        for (int i = 0; i <v ; i++) {
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 4);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);
     printGraph(adj);

    }
    //  Adjacency list
    static void addEdge(ArrayList<ArrayList<Integer>> adj , int u ,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    static void printGraph(ArrayList<ArrayList<Integer>> adj ){

        for (int i = 0; i <adj.size() ; i++) {
            System.out.print("Adjacency list of vertex "+ i+" : " );
            for (int j = 0; j <adj.get(i).size() ; j++) {
                System.out.print( adj.get(i).get(j)+" "  );
            }
            System.out.println();
        }
    }
}
