import java.util.*;

public class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        // Graph representation using HashMap
        Map<String, Map<String, Double>> graph = new HashMap<>();
        
        // Build the graph
        for (int i = 0; i < equations.size(); i++) {
            List<String> equation = equations.get(i);
            String u = equation.get(0);
            String v = equation.get(1);
            double value = values[i];
            
            graph.putIfAbsent(u, new HashMap<>());
            graph.putIfAbsent(v, new HashMap<>());
            
            graph.get(u).put(v, value);
            graph.get(v).put(u, 1.0 / value);
        }
        
        double[] results = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            List<String> query = queries.get(i);
            String start = query.get(0);
            String end = query.get(1);
            
            if (!graph.containsKey(start) || !graph.containsKey(end)) {
                results[i] = -1.0;
            } else {
                Set<String> visited = new HashSet<>();
                results[i] = dfs(graph, start, end, 1.0, visited);
            }
        }
        
        return results;
    }
    
    private double dfs(Map<String, Map<String, Double>> graph, String current, String target, double product, Set<String> visited) {
        if (current.equals(target)) return product;
        
        visited.add(current);
        
        Map<String, Double> neighbors = graph.get(current);
        for (String neighbor : neighbors.keySet()) {
            if (!visited.contains(neighbor)) {
                double result = dfs(graph, neighbor, target, product * neighbors.get(neighbor), visited);
                if (result != -1.0) {
                    return result;
                }
            }
        }
        
        visited.remove(current);
        return -1.0;
    }
}
