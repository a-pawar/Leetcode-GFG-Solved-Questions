class Solution {
    public int rob(int[] nums) {
        int [] dp = new int[nums.length];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        return robHelper(nums,dp,nums.length-1);
    }
    public int robHelper(int [] nums,int [] dp,int index){
        if(index==0){
            return nums[index];
        }
        if(index<0){
            return 0;
        }
        int ans;
        if(dp[index]==-1){
            int pick = nums[index]+robHelper(nums,dp,index-2);
            int notPick=robHelper(nums,dp,index-1);
             ans = Math.max(pick,notPick);
            dp[index]=ans;  
        }else{
            ans=dp[index];
        }
        
        return ans;
    }
}