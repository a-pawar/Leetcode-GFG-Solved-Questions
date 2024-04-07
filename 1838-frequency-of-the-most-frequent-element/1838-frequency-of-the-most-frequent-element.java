class Solution {
    public int maxFrequency(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int l=0,r=0,ans=0;
        long sum=0;
        while(r<n){
            sum+=nums[r];
            
            while(nums[r]*(r-l+1L)>k+sum){
                sum -= nums[l];
                l++;
               
            }
            ans = Math.max(ans,(r-l+1));
            r++;
        }
        return ans;
    }
}