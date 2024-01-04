class Solution {
    public int minOperations(int[] nums) {
        Map<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int temp = map.get(nums[i]);
                map.put(nums[i],temp+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int operation=0;
        Set<Integer> keys = map.keySet();
        for(int key:keys){
            int val=map.get(key);
           if(val==1){
               return -1;
           } 
            if(val==2){
                operation+=1;
            }
            else if(val%3==0){
                operation+=val/3;
            }else{
                //for remaining number 
               
                operation =operation+val/3+1;
            }
            
        }
        return operation;
    }
}