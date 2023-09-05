class Solution {
    public int missingNumber(int[] nums) {
    //approach 2 - using bit-manipulation
    int xor =0,i=0;
    for( i=0;i<nums.length;i++){
        xor = xor^i^nums[i];
    }
    return xor^i;
    //approach 1
    //     int i=0;
    //     //we are using cyclic sort here 
    //     // we swap every element corresponding to its index
    //     while(i<nums.length){
    //         if(nums[i]<nums.length && i != nums[i])
    //            swap(nums,i,nums[i]);  
    //         else
    //             i++; 
    //     }
    //     //check which element are not at its actual position
    //     //that is missing number
    //     for(int i1=0;i1<nums.length;i1++){
    //         if(i1!=nums[i1]){
    //             return i1;
    //         }
            
    //     }
    //     return nums.length;
    }
    
    // public void swap(int [] nums,int a,int b){
        
    //         int temp = nums[a];
    //         nums[a] = nums[b];
    //         nums[b] = temp;  
        
    // }
}