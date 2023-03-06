class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] arr  = new int[nums.length];
        int a=0;
        for(int i=0;i<n*2;i+=2){
            arr[i]=nums[a++];
            arr[i+1]=nums[n+a-1];
        }
        return arr;
    }
}