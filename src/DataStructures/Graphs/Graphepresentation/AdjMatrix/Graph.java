package DataStructures.Graphs.Graphepresentation.AdjMatrix;

//Adjacency Matrix
public class Graph {
    int V; //no of vertices or nodes
    int[][] adjMatrix;//Adjacency Matrix

    Graph(int vertices){
        V = vertices;
        adjMatrix = new int[V][V];
    }

    //unweighted undirected graph
    void addEdge(int u , int v){
        adjMatrix[u][v]=1;//if weights given = to weights otherwise assume 1
        adjMatrix[v][u]=1;
    }

    void printAdjMatrix(){
        System.out.println("Adjacency Matrix: ");
        for(int i=0;i<V;i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class Driver{
    static void main(String[] args) {
        Graph g = new Graph(6);
        g.addEdge(5,0);
        g.addEdge(5,4);
        g.addEdge(0,4);
        g.addEdge(0,1);
        g.addEdge(1,4);
        g.addEdge(4,3);
        g.addEdge(1,3);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.printAdjMatrix();
    }
}