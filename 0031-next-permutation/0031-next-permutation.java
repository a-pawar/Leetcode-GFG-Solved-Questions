class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i==-1){
            reverse(nums,0,nums.length-1);
            return;
        }
        int j=nums.length-1;
        while(nums[j] <= nums[i]){
            j--;
        }
        swap(nums,i,j);
        reverse(nums,i+1,nums.length-1);   
    }
    private static void swap(int [] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private static void reverse(int [] nums,int s,int e){
        while(s<e){
            swap(nums,s,e);
            s++;
            e--;
        }
    }
}