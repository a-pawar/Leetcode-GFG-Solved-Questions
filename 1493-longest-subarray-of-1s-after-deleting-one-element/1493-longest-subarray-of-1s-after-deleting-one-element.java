class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int l=0,r=0;
        int countzero=0,ans=0;
        while(r<n){
            if(nums[r]==0){
                countzero++;
            }
            while(countzero>1){
                if(nums[l]==0) countzero--;
                l++;
            }
            ans = Math.max(ans,r-l+1);
            r++;

        }
        return ans-1;
    }
}