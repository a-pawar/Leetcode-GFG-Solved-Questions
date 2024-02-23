class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        Map<Integer, List<int[]>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(i, new ArrayList<>());
        }

        for (int[] f : flights) {
            int s = f[0]; // starting point
            int e = f[1]; // ending point
            int cost = f[2]; // cost to reach from s to e
            map.get(s).add(new int[] { e, cost });
        }

        Queue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        int[] dis = new int[n];
        Arrays.fill(dis, -1);

        int[] maxmove = new int[n];
        Arrays.fill(maxmove, Integer.MAX_VALUE);

        dis[src] = 0;
        pq.offer(new int[] { src, 0, 0 });
        while (!pq.isEmpty()) {
            int[] ele = pq.poll();
            int node = ele[0];
            int dist = ele[1];
            int moves = ele[2];

            if (maxmove[node] < moves) {
                continue;
            }
            maxmove[node] = moves;

            for (int[] edge : map.get(node)) {
                int neigh = edge[0];
                int weight = edge[1];

                int neigh_dist = weight + dist;
                if (dis[neigh] == -1 || neigh_dist < dis[neigh]) {
                    dis[neigh] = neigh_dist;
                }
                if (k != moves) {
                    pq.offer(new int[] { neigh, neigh_dist, moves + 1 });
                }
            }
        }

        return dis[dst];
    }
}