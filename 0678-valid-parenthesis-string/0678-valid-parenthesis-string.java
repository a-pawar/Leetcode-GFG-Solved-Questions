class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();
        int[][] dp = new int[n+1][n+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                dp[i][j]=-1;
            }
        }
        
        return solve(0,0,s,n,dp);
    }
    public boolean solve(int i,int open , String s,int n,int [][] dp){
        if(i==n){
            return open==0;
        }
        if(dp[i][open]!=-1){
            if(dp[i][open]==1){
                return true;
            }
             return false;
            
        }
        boolean isValid=false;
        if(s.charAt(i)=='('){
            isValid |= solve(i+1,open+1,s,n,dp);
        }else if(s.charAt(i)=='*'){
            //assume * as (
            isValid |= solve(i+1,open+1,s,n,dp);
            //* as empty
            isValid |= solve(i+1,open,s,n,dp);
            //* as )
            if(open>0){
                isValid |= solve(i+1,open-1,s,n,dp);
            }
        }else if(open>0){
            isValid |= solve(i+1,open-1,s,n,dp);
        }
        if(isValid){
            dp[i][open]=1;
        }else{
            dp[i][open]=0;
        }
        
        return isValid;
    }
}