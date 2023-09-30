class Solution {
    public int maximumCount(int[] nums) {
        //brute-force
        int pos=0,neg=0;
        for(int i=0;i<nums.length;i++){
            if(0<nums[i]){
                pos++;
            }
            else if(nums[i]<0){
                neg++;
            }
        }
        if(pos>neg){
            return pos;
        }
         return neg;
    //optimized
    }
}