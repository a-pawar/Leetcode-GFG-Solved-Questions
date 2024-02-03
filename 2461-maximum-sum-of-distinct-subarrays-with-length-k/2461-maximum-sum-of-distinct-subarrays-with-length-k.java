class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long ans = 0,sum=0; 
        HashMap<Integer,Integer> map = new HashMap<>();
        int distinct = 0;
        for(int i=0;i<k;i++){
            if(map.containsKey(nums[i])){
                int val = map.get(nums[i]);
                map.put(nums[i],val+1);
            }else{
                distinct++;
                map.put(nums[i],1);
            }
            sum += nums[i];
        }
        if(distinct==k && ans<sum){
            ans = sum;
        }
        for(int i=k;i<nums.length;i++){
            //remove 1st element
            int pop = nums[i-k];
            int val = map.get(pop);
            sum = sum - pop;
            if(val>1){
                map.put(pop,val-1);
            }else{
                map.remove(pop);
                distinct--;
            }
            //add current element
            if(map.containsKey(nums[i])){
                 val = map.get(nums[i]);
                map.put(nums[i],val+1);
            }else{
                distinct++;
                map.put(nums[i],1);
            }
            sum += nums[i];
            if(distinct==k && ans<sum){
                ans = sum;
            }
            
        }
        return ans;

    }
}