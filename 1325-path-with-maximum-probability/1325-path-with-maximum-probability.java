import java.util.*;

class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        // Create an adjacency list
        Map<Integer, List<Pair>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            double prob = succProb[i];
            graph.get(u).add(new Pair(v, prob));
            graph.get(v).add(new Pair(u, prob));
        }

        // Use a priority queue to perform a modified Dijkstra's algorithm
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Double.compare(b.prob, a.prob));
        double[] maxProb = new double[n];
        maxProb[start_node] = 1.0;  // Start with probability 1 at start_node
        pq.add(new Pair(start_node, 1.0));

        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            int node = current.node;
            double prob = current.prob;

            // If we reach the end_node, return the probability
            if (node == end_node) {
                return prob;
            }

            // Explore neighbors
            for (Pair neighbor : graph.get(node)) {
                int nextNode = neighbor.node;
                double edgeProb = neighbor.prob;

                // If we found a path with a higher probability, update and push to the queue
                if (prob * edgeProb > maxProb[nextNode]) {
                    maxProb[nextNode] = prob * edgeProb;
                    pq.add(new Pair(nextNode, maxProb[nextNode]));
                }
            }
        }

        // If we never reach the end_node, return 0
        return 0.0;
    }

    // Pair class to store node and its probability
    class Pair {
        int node;
        double prob;

        Pair(int node, double prob) {
            this.node = node;
            this.prob = prob;
        }
    }
}
