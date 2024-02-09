class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int [] dp = new int[nums.length];
        int [] prev_index = new int[nums.length];
        int maxLenIndex=0;
        int maxLen=1;
        
        for(int i=0;i<nums.length;i++){
            dp[i]=1;
            prev_index[i]=-1;
        }

        for(int i=1;i<dp.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0){
                    if(dp[i]<dp[j]+1){
                        dp[i] = dp[j]+1;
                        prev_index[i]=j;

                    }
                    if(dp[i]>maxLen){
                        maxLen=dp[i];
                        maxLenIndex=i;
                    }
                }
            }
        }
        List<Integer> ans = new ArrayList<Integer>();
        while(maxLenIndex!=-1){
            ans.add(0,nums[maxLenIndex]);
            maxLenIndex = prev_index[maxLenIndex];
        }
        return ans;

    }
}