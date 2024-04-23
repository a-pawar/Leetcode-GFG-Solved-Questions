import java.util.*;

class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        // If there is only one node in the tree, return it as the root
        if (n == 1) {
            return Collections.singletonList(0);
        }
        
        // Create an adjacency list to represent the graph
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }
        
        // Initialize a queue for BFS
        Queue<Integer> leaves = new LinkedList<>();
        // Add all nodes with only one neighbor to the leaves queue
        for (int i = 0; i < n; i++) {
            if (adjList.get(i).size() == 1) {
                leaves.offer(i);
            }
        }
        
        // Repeat until there are 1 or 2 nodes left
        while (n > 2) {
            int size = leaves.size();
            n -= size;
            // Process all leaves at this level
            for (int i = 0; i < size; i++) {
                int leaf = leaves.poll();
                // Get the only neighbor of this leaf
                int neighbor = adjList.get(leaf).get(0);
                // Remove the leaf from its neighbor's adjacency list
                adjList.get(neighbor).remove(Integer.valueOf(leaf));
                // If the neighbor becomes a leaf, add it to the queue
                if (adjList.get(neighbor).size() == 1) {
                    leaves.offer(neighbor);
                }
            }
        }
        
        // At this point, we have 1 or 2 nodes left which are the roots of the minimum height trees
        List<Integer> result = new ArrayList<>(leaves);
        return result;
    }
}