package OA;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author kaitavmehta created on 2020-09-16
 */
public class BFSGraph {
    public static void main(String args[]) {
        Graph g = new Graph(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);

        g.BFS(0);
    }


    static class Graph {
        private int V; // no of vertices
        private LinkedList<Integer> adj[]; // adjacency list

        public Graph(int v) {
            V = v;
            adj = new LinkedList[v];
            // why? a ll for each vertices?
            for (int i = 0; i < v; i++) {
                adj[i] = new LinkedList<>();
            }
        }

        void addEdge(int v, int w) {
            adj[v].add(w);
        }

        void BFS(int s) {

            boolean visited[] = new boolean[V];

            Queue<Integer> queue = new LinkedList<>();

            visited[s] = true;
            queue.add(s);


            while (queue.size() != 0) {

                s = queue.poll();
                System.out.println(s + " ");

                for (int n : adj[s]) {
                    if (!visited[n]) {
                        visited[n] = true;
                        queue.add(n);
                    }
                }
            }

        }


    }

}
