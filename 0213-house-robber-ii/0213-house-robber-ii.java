class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int [] dp = new int[nums.length-1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        //exclude first
        int [] nums1=new int[nums.length-1];
        for(int i=0;i<nums.length;i++){
            if(i!=0){
                nums1[i-1]=nums[i];
            }
        }
        int ans1= robHelper(nums1,dp,nums1.length-1);
        //exclude last
        int [] nums2 =new int[nums.length-1];
        for(int i=0;i<nums.length;i++){
            if(i!=nums.length-1){
                nums2[i]=nums[i];
            }
        } 
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        int ans2= robHelper(nums2,dp,nums2.length-1);
        return Math.max(ans1,ans2);
    }
    public int robHelper(int [] nums,int [] dp,int index){
        if(index==0){
            return nums[index];
        }
        if(index<0){
            return 0;
        }
        int ans;
        if(dp[index]==-1){
            int pick = nums[index]+robHelper(nums,dp,index-2);
            int notPick=robHelper(nums,dp,index-1);
             ans = Math.max(pick,notPick);
            dp[index]=ans;  
        }else{
            ans=dp[index];
        }
        
        return ans;
    }
}