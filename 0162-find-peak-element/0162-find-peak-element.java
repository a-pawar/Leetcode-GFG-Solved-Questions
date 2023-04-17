class Solution {
    public int findPeakElement(int[] nums) {
        int s =0;
        int e = nums.length-1;
        while(s<e){
            int mid = s + (e-s)/2;

            if(mid>0 && nums[mid]<nums[mid-1]){
                e=mid-1;
            }
            else if(mid<nums.length-1 && nums[mid+1]>nums[mid] ){
                s=mid+1;
            }
            else{
                return mid;
            }
            
        }
        return s;
    }
}