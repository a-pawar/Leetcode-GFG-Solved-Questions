class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum=0;
        long ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<sum){
                ans=sum+nums[i];
            }
            sum+=nums[i];
            
        }
        if(ans==0){
            return -1;
        }
        return ans;
    }
}