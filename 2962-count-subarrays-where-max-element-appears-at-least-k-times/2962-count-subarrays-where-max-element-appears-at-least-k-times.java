class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i : nums){
            if(max<i){
                max=i;
            }
        }
        //classic sliding window
        int i =0;
        int j=0;
        long ans=0;
        int countMax=0;
        while(j<n){
            if(nums[j]==max){
                countMax++;
            }

            while(countMax>=k){
                ans += n-j;
                if(nums[i]==max){
                    countMax--;
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}