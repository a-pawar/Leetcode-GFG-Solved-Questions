class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int [] newarr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int [] temp = new int[i+1];
            for(int j=0;j<i+1;j++){
                if(j<index[i]){
                    temp[j] = newarr[j];
                }
                else if(j==index[i]){
                    temp[j] = nums[i];
                }
                else{
                    temp[j]=newarr[j-1];
                }
            }
            for(int k=0;k<i+1;k++){
                newarr[k]=temp[k];
            }
        }
        return newarr;
    }
}