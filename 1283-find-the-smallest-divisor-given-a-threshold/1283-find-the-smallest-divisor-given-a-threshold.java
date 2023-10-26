class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]>maxi){
                maxi=nums[i];
            }
        }
        // System.out.print(mini+" "+maxi);
        int start=1,end=maxi;
        int ans=0;
        while(start<=end){
            int mid=(end-start)/2+start;
            int totalDivisor=0;
            for(int i=0;i<nums.length;i++){
                totalDivisor+=Math.ceil(((double)nums[i])/(double)(mid));
            }
            if(totalDivisor<=threshold){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
}