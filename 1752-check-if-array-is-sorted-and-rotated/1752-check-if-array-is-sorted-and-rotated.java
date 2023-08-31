class Solution {
    public boolean check(int[] nums) {
        int count=0;
        if(nums.length<=2){
            return true;
        }
        int store = nums[0];
        int pivotIndex = 0;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                pivotIndex = i-1;
                count++;
            }
            if( count>=2){
                return false;
            }
            if( count==1 && store<nums[i] ){
                return false;
            }
        }
        return true;
    }
}