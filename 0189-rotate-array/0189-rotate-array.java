class Solution {
    public void rotate(int[] nums, int k) {
    //approach 1
        // int n = nums.length;
        // k = k%n;
        // int arr [] = new int[k];
        // for(int i=0;i<k;i++){
        //    arr[i]=nums[n-k+i]; 
        // }
        // int j = n-k-1;
        // for(int i=0;i<n-k;i++){
        //     nums[n-i-1] = nums[j];
        //     j--;
        // }
        // for(int i=0;i<k;i++){
        //    nums[i]=arr[i]; 
        // }
    //approach2-reverse the whole array then reverse the first k elemnt and then reverse after k element  o()
        k = k%nums.length;
        //rotate all element 
        rotateArray(nums,0,nums.length-1);
        //rotate first k element
        rotateArray(nums,0,k-1);
        //rotate elements after k
        rotateArray(nums,k,nums.length-1);
    }
    public void rotateArray(int nums[],int s,int e){
        while(s<e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
}