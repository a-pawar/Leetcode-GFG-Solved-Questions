class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    //approach 1 -- memory wastage
        // int [] nums3 = new int[m];
        // for(int i=0;i<m;i++){
        //     nums3[i] = nums1[i];
        // }
        // int i=0,j=0,k=0;
        // while(i<m && j<n){
        //     if(nums3[i]<nums2[j]){
        //         nums1[k] = nums3[i];
        //         i++;
        //         k++;
        //     }else{
        //         nums1[k] = nums2[j];
        //         j++;
        //         k++;
        //     }
        // }
        // while(i<m ){
        //         nums1[k] = nums3[i];
        //         i++;
        //         k++;
        // }
        // while(j<n){
        //         nums1[k] = nums2[j];
        //         j++;
        //         k++;     
        // }
    // approach2 
        int i=m-1,j=n-1,k=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            }else{
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
        while(i>=0 ){
                nums1[k] = nums1[i];
                i--;
                k--;
        }
        while(j>=0){
                nums1[k] = nums2[j];
                j--;
                k--;
        }
    }
}