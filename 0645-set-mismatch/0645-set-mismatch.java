class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        boolean arr[] = new boolean [n+1];
        int dup = -1;
        for(int i=0;i<n;i++){
            int elem = nums[i];
            if(arr[elem]){
                dup=elem;
            }
            arr[elem]=true;
        }
        int missing = -1;
        for(int i=1;i<n+1;i++){
            if(!arr[i]){
                missing=i;
                break;
            }
        }
        int [] ans = {dup,missing};
        return ans;
    }
}