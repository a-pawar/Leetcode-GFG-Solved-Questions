public class Solution {
    final int M = 1000000007;

    public int kInversePairs(int n, int k) {
        int[][] t = new int[n + 1][k + 1];

        for (int i = 0; i < n + 1; i++) {
            t[i][0] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                for (int inv = 0; inv <= Math.min(i - 1, j); inv++) {
                    t[i][j] = (int) ((t[i][j] + t[i - 1][j - inv]) % M);
                }
            }
        }
        return t[n][k];
    }
}

