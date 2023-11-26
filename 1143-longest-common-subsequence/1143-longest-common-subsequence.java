class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();

        int [][] dp = new int [m+1][n+1];

        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                int ans;
                if(text1.charAt(i)==text2.charAt(j)){
                    ans = 1+dp[i+1][j+1];
                }else{
                    int ans1=dp[i+1][j];
                    int ans2 = dp[i][j+1];
                    ans=Math.max(ans1,ans2);
                }
                dp[i][j] = ans;
            }
        }
        return dp[0][0];
    }
}