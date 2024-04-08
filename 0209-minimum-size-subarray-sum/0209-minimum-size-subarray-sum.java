class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int l=0,r=0,sum=0,ans=Integer.MAX_VALUE;
        while(r<n){
            sum += nums[r];
            while(sum>=target){
                int len = r-l+1;
                if(len<ans){
                    ans=len;
                }
                sum-=nums[l];
                l++;
            }
            r++;
        }
        if(ans==Integer.MAX_VALUE){
            return 0;
        }
        return ans;
    }
}