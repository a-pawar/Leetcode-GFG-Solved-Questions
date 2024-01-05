class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        dp[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--){
            int max=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    if(max<dp[j]){
                        max=dp[j];
                    }
                } 
            }
            dp[i]=max+1;
            
        }
        int ans=0;
        for(int i=0;i<dp.length;i++){
            if(ans<dp[i]){
                ans=dp[i];
            }
        }
        return ans;
        
    }
    
    
}