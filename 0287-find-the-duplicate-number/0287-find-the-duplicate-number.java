class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        //floyd cycle detection algo
        //finding meeting point
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);
        //finding duplicate
        slow = nums[0];
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;
    }
}