class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                int val = map.get(nums[i]);
                val++;
                map.put(nums[i],val);
            }
            else{
                map.put(nums[i],1);
            } 
        }
        Set<Integer> keys = map.keySet();
        for(int i:keys){
            if(map.get(i)>n/3){
                list.add(i);
            } 
        }
        
        return list;
        
    }
}