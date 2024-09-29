import java.util.Scanner;

public class Graph_Implementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of edges and indices: ");
        int vertices = sc.nextInt();
        int edges = sc.nextInt();

        Graph graph = new Graph(vertices);

        System.out.println("Enter the edges: ");
        for (int i = 0; i < edges; i++) {
            int source = sc.nextInt();
            int destination = sc.nextInt();
            graph.insertEdge(source, destination);

        }
        System.err.println("Enter source for BFS traversal: ");
        int BFSsource = sc.nextInt();
        graph.bfs(BFSsource);
        graph.dfs(BFSsource);
        sc.close();
    }
}