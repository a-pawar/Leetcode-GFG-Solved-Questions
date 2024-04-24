class Solution {
    public int tribonacci(int n) {
        int [] dp = new int [n+1];
        for(int i=0;i<n+1;i++){
            dp[i]=-1;
        }
        return helper(n,dp);
        
        
    }
    public int helper(int n,int [] dp){
        int t0=0,t1=1,t2=1;
        if(n==0){
            return 0;
        }
        if(n<=2){
            return 1;
        }
        int temp1,temp2,temp3;
        if(dp[n-1]!=-1){
            temp1 = dp[n-1];
        }else{
            temp1=helper(n-1,dp);
            dp[n-1]=temp1;
        }
        if(dp[n-2]!=-1){
            temp2 = dp[n-2];
        }else{
            temp2=helper(n-2,dp);
            dp[n-2]=temp2;
        }
        if(dp[n-3]!=-1){
            temp3 = dp[n-3];
        }else{
            temp3=helper(n-3,dp);
            dp[n-3]=temp3;
        }
        return temp1+temp2+temp3;
    }
}