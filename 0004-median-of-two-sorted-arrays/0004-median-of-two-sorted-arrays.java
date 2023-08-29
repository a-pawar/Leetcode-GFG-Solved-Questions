class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0,k=0;
        int[] nums3 = new int[nums1.length+nums2.length];
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                nums3[k++]=nums1[i++];
            }else{
                nums3[k++]=nums2[j++];
            }  
        }
        
        while(i<nums1.length ){
                nums3[k++]=nums1[i++];
        }
        while(j<nums2.length){
                nums3[k++]=nums2[j++];
        }
        int size = nums3.length;
        double ans =0;
        if(size%2==0){
            int index = size/2;
            int a = nums3[index-1];
            int b = nums3[index];
            ans = (a+b)*(1.0)/2;
        }else{
            ans = nums3[size/2];
        }
        return ans;
    }
}