class Solution {
    public int[] rearrangeArray(int[] nums) {
        //create a new array of same size
        int [] arr = new int[nums.length];
        int pos=0,neg=1;
        for(int i=0;i<nums.length;i++){
            //if element is negative store at odd indexs
            if(nums[i]<0){
                arr[neg]=nums[i];
                neg=neg+2;
            }
            //if element is positive store at even index res
            else{
                arr[pos]=nums[i];
                pos=pos+2;
            }
        }
        return arr;
    }
}