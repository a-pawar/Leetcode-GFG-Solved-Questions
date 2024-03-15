class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] ans = new int[nums.length];
        int product =1;
        for(int i=0;i<nums.length;i++){
            product = product*nums[i];
        }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                ans[i]=(int)(product/nums[i]);
            }  
            else{
                int temp=1;
               for(int j=0;j<nums.length;j++){
                   if(i!=j){
                       temp = temp*nums[j];
                   }
                } 
                ans[i]=temp;
            }
        }
        return ans;
    }
}