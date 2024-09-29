import java.util.*;

public class Graph {
    private LinkedList<Integer> adjacent[];

    @SuppressWarnings("unchecked")
    public Graph(int vertices) {
        adjacent = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacent[i] = new LinkedList<>();
        }
    }

    public void insertEdge(int source, int destination) {
        adjacent[source].add(destination);
        adjacent[destination].add(source);

    }

    public void bfs(int BFSsource) {
        boolean visited[] = new boolean[adjacent.length];
        int parent_nodes[] = new int[adjacent.length];
        Queue<Integer> current_nodes = new LinkedList<>();
        current_nodes.add(BFSsource);
        visited[BFSsource] = true;
        parent_nodes[BFSsource] = -1;

        while (!current_nodes.isEmpty()) {
            int pr = current_nodes.poll();
            System.out.println(pr);

            for (int i : adjacent[pr]) {
                if (visited[i] != true) {
                    visited[i] = true;
                    current_nodes.add(i);
                    parent_nodes[i] = pr;
                }

            }
        }

    }

    public void dfs(int BFSsource) {
        boolean visited[] = new boolean[adjacent.length];
        int parent_nodes[] = new int[adjacent.length];
        Stack<Integer> current_nodes = new Stack<>();
        current_nodes.add(BFSsource);
        visited[BFSsource] = true;
        parent_nodes[BFSsource] = -1;

        while (!current_nodes.isEmpty()) {
            int pr = current_nodes.pop();
            System.out.println(pr);

            for (int i : adjacent[pr]) {
                if (visited[i] != true) {
                    visited[i] = true;
                    current_nodes.add(i);
                    parent_nodes[i] = pr;
                }

            }
        }

    }
}
