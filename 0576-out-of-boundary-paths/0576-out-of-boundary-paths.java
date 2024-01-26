class Solution {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int dp [][][] = new int [m+1][n+1][maxMove+1];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                for(int k=0;k<maxMove+1;k++){
                    dp[i][j][k]=-1;
                }  
            }
        }
        return findPathsHelper(m,n,maxMove,startRow,startColumn,dp);
    }
    public int findPathsHelper(int m, int n, int maxMove, int startRow, int startColumn,int[][][] dp) {
        
        if(startRow < 0 || startColumn<0 || startRow>=m || startColumn>=n){
            return 1;
        }
        if(maxMove<=0){
            return 0;
        }
        if(dp[startRow][startColumn][maxMove]!=-1){
            return dp[startRow][startColumn][maxMove];
        }
        long ans1,ans2,ans3,ans4;
        //left
             ans1 = findPathsHelper(m,n,maxMove-1,startRow,startColumn-1,dp) % 1000000007;
       
        
        //right
             ans2 = findPathsHelper(m,n,maxMove-1,startRow,startColumn+1,dp)% 1000000007;
           
        
        //top
            ans3 = findPathsHelper(m,n,maxMove-1,startRow-1,startColumn,dp)% 1000000007;
           
         
        //down
            ans4 = findPathsHelper(m,n,maxMove-1,startRow+1,startColumn,dp)% 1000000007;
            
         
        long ans = (ans1 + ans2 + ans3 + ans4)% 1000000007 ;
        dp[startRow][startColumn][maxMove]=(int)ans;
        return (int)ans;
    }
}