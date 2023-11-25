class Solution {
    public int minPathSum(int[][] grid) {
        int dp[][] = new int[grid.length+1][grid[0].length+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=Integer.MIN_VALUE;
            }
        }
        return minPathSumHelper(grid,dp,0,0);
    }
    public int minPathSumHelper(int [][] grid,int [][] dp,int i,int j){
        int m=grid.length;
        int n=grid[0].length;
        //special case
        if(i==m-1 && j==n-1){
            return grid[i][j];
        }
        //base case
        if(i>=m || j>=n){
            return Integer.MAX_VALUE;
        }
        int ans1,ans2;
        if(dp[i+1][j]==Integer.MIN_VALUE){
         ans1=minPathSumHelper(grid,dp,i+1,j);
         dp[i+1][j]=ans1;
        }else{
            ans1=dp[i+1][j];
        }
        if(dp[i][j+1]==Integer.MIN_VALUE){
         ans2=minPathSumHelper(grid,dp,i,j+1);
         dp[i][j+1]=ans2;
        }else{
            ans2=dp[i][j+1];
        }

        int myans =grid[i][j]+ Math.min(ans1,ans2);
        return myans;
    }
}