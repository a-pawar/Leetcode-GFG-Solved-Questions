class Solution {
    public int numTrees(int n) {
        int ans = catalan(n);
        return ans;
    }
    private int catalan(int n)
    {
        long res = 1;
        // Iterate till N
        for (int i = 1; i <= n; i++) {
            // Calculate the ith Catalan Number
            res = (res * (4 * i - 2)) / (i + 1);
            
        }
        return (int)res;
    }
}