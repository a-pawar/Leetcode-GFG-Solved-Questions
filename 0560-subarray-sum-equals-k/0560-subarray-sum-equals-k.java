class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int prefixSum=0,count=0, findVal=0;
        map.put(prefixSum,1);

        for(int i=0;i<nums.length;i++){
            prefixSum += nums[i];
             findVal = prefixSum-k;
            if(map.containsKey(findVal)){
                count = count + map.get(findVal);
            }

            if(map.containsKey(prefixSum)){
                map.put(prefixSum,map.get(prefixSum)+1);
            }else{
                map.put(prefixSum,1);
            }
        }
        return count;
    }
}