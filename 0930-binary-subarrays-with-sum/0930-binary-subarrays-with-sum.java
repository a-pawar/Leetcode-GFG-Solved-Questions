class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        int result=0,i=0,j=0;
        int count_zeros=0,window_sum=0;
        while(j<n){
            window_sum += nums[j];
            while(i<j && (nums[i]==0 || window_sum>goal)){
                if(nums[i]==0){
                    count_zeros++;
                }else{
                    count_zeros=0;
                }
                window_sum -= nums[i];
                i++;
            }
            if(window_sum == goal){
                result += 1+count_zeros;
            }
            j++;
        }
        return result;
    }
}