class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean contains1 =false;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                contains1=true;
            }
            if(nums[i]<=0 || nums[i]>n){
                nums[i]=1;
            }
        }
        if(!contains1){
            return 1;
        }
        for(int i=0;i<n;i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index]>0){
                nums[index] = nums[index]*(-1);
            }

        }
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        return n+1;
    }
}