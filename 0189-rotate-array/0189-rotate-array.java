class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        int arr [] = new int[k];
        for(int i=0;i<k;i++){
           arr[i]=nums[n-k+i]; 
        }
        int j = n-k-1;
        for(int i=0;i<n-k;i++){
            nums[n-i-1] = nums[j];
            j--;
        }
        for(int i=0;i<k;i++){
           nums[i]=arr[i]; 
        }


    }
}