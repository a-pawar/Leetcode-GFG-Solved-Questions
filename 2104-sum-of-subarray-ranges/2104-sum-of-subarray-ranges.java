class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long ans = 0;
        for(int i=0;i<n;i++){
            int lar=nums[i],small=nums[i];
            for(int j=i;j<n;j++){
                if(nums[j]>lar){
                    lar=nums[j];
                }
                if(nums[j]<small){
                    small=nums[j];
                }
                int diff = lar - small;
                ans += diff;
            }
            
        }
        return ans;
    }
}