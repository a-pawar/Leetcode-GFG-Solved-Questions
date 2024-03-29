class Solution {
    public boolean search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if(pivot==-1){
            return binarySearch(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target){
            return true;
        }
        else if(nums[0]<=target)
            return binarySearch(nums,target,0,pivot-1);
        else {
            return binarySearch(nums,target,pivot+1,nums.length-1);
        }
    }
     public boolean binarySearch(int [] nums,int target,int start,int end){
        int mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(nums[mid]==target){
                return true;
            }
            else if(nums[mid]<target){
                start = mid+1;
            }
            else {
                 end = mid-1;
            }
        }
        return false;
    }
    public int findPivot(int [] nums){
            int start=0;
            int end = nums.length-1;
            
            while(start<=end){
                int mid=start + (end-start)/2;
                if(mid<end && nums[mid]>nums[mid+1])
                    return mid;
                if(mid>start && nums[mid]<nums[mid-1]){
                    return mid-1;
                }
                if(nums[start]==nums[mid] && nums[mid] == nums[end]){
                    if(mid<end && nums[start]>nums[start+1]){
                        return start;
                    }
                    start++;
                    if(mid>start && nums[end]<nums[end-1]){
                        return end-1;
                    }
                    end--;
                }
                else if(nums[start]<nums[mid] || nums[start]==nums[mid] && nums[mid]>nums[end]){
                    start= mid+1;
                }
                else{
                    end = mid-1;
                }
               
            }
            return -1;
        }
}
