class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int result=0;
        HashMap<Long, Long>[] mp = new HashMap[n];
        // Populate the array with HashMap objects
        for (int i = 0; i < n; i++) {
            mp[i] = new HashMap<>();
        }
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                long diff = (long)nums[i]-nums[j];
                Map<Long,Long> map = mp[j];
                long temp=0;
                mp[i].put(diff, mp[i].getOrDefault(diff,temp) + 1);
                if(map.containsKey(diff)){
                    
                    long val = map.get(diff);
                    mp[i].put(diff, mp[i].get(diff) + val);
                    
                    result+=val;
                    
                }
            }
        }
        return result;
    }
}