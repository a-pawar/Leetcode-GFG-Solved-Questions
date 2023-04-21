class Solution {
    public boolean containsDuplicate(int[] nums) {
        /*
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
        */
        Set<Integer> data = new LinkedHashSet<Integer>();

        for(int a: nums){
            data.add(a);
        }
        if(nums.length == data.size()){
            return false;
        }
        return true;
    }
    
    
}