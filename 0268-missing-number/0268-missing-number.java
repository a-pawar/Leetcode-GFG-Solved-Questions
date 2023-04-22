class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]<nums.length && i != nums[i])
               swap(nums,i,nums[i]);  
            else
                i++; 
        }
        for(int i1=0;i1<nums.length;i1++){
            if(i1!=nums[i1]){
                return i1;
            }
            
        }
        return nums.length;
    }
    
    public void swap(int [] nums,int a,int b){
        
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;  
        
    }
}