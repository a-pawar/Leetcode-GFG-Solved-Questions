class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        return maxSumAfterPartitioningHelper(arr,k,n,0,dp);
        
    }
    public int maxSumAfterPartitioningHelper(int []arr,int k,int n,int i,int [] dp){
        if(i==n){
            return 0;
        }
        int result=0;
        int curr_max = -1;
        if(dp[i]!=-1){
            return dp[i];
        }
        
        for(int j=i;j-i+1<=k && j<n;j++){
            curr_max = Math.max(arr[j],curr_max);
            int maxSum = curr_max*(j-i+1);
             
            
            int smallans = maxSum+maxSumAfterPartitioningHelper(arr,k,n,j+1,dp); 
            result = Math.max(result,smallans); 
        }
       dp[i]=result;
        return result;
    }
}