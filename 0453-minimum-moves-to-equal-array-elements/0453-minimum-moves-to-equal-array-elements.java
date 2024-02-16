class Solution {
    public int minMoves(int[] nums) {
        int moves=0;
        int min=findMin(nums);
        //instead of increasing n-1 we will decrease max  element to min
        for(int i=0;i<nums.length;i++){
            moves =moves+ nums[i]-min;
        }
        return moves;

    }
    public int findMin(int [] nums){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }
}