class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        List<Integer> list = new ArrayList<Integer>();
        while(i < nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(j != nums[j]-1){
                list.add(nums[j]);
            }
        }
        return list;
    }
    public void swap(int [] nums, int a ,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}