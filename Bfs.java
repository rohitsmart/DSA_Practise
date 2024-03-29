import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
    static class Graph {
        private int V;
        private LinkedList<Integer>[] adj;

        @SuppressWarnings("unchecked")
		Graph(int v) {
            V = v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; ++i)
                adj[i] = new LinkedList<>();
			printAdjacencyList();	
        }
		void printAdjacencyList() {
            System.out.println("Adjacency List:");
            for (int i = 0; i < V; ++i) {
                System.out.print(i + " -> ");
                for (int neighbor : adj[i]) {
                    System.out.print(neighbor + " ");
                }
                System.out.println();
            }
        }

        void addEdge(int v, int w) {
            adj[v].add(w);
			System.out.println("after vertex "+v+" creation: "+w);

			printAdjacencyList();
        }

        void bfs(int startNode) {
            boolean[] visited = new boolean[V];
            Queue<Integer> queue = new LinkedList<>();

            visited[startNode] = true;
            queue.add(startNode);

            while (!queue.isEmpty()) {
                int currentNode = queue.poll();
                System.out.print(currentNode + " ");

                for (int neighbor : adj[currentNode]) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        queue.add(neighbor);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int vertices = 7;

        Graph graph = new Graph(vertices);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
		graph.addEdge(3, 5);
		graph.addEdge(4, 5);
		// System.out.println("after graph creation:");
        System.out.print(
                "Breadth First Traversal starting from vertex 0: ");
        graph.bfs(0);
    }
}
