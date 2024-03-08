class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        int count=0;
        int [] f = new int[101];
        for(int i=0;i<n;i++){
           f[nums[i]]++;
        }
        int max=0;
        for(int i=0;i<101;i++){
            if(f[i]>max){
                max=f[i];
            }
        }
        for(int i=0;i<101;i++){
            if(f[i]==max){
                count+=max;
            }
        }
        return count;
        
    }
}