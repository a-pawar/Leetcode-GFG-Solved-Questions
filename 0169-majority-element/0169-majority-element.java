class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int Element=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                Element = nums[i];
            }
            if(Element == nums[i]){
                count++;
            }
            else{
                count--;
            }  
        }
        return Element;
    }
}