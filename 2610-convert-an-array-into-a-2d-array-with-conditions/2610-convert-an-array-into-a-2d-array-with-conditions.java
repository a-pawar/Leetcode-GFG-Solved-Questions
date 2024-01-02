import java.util.Set;
class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int val = map.get(nums[i]);
                map.put(nums[i],val+1);
            }else{
                map.put(nums[i],1);
            }
        }
        List<List<Integer>> outer = new ArrayList<List<Integer>>();
        boolean flag=true;
        while(flag){
            List<Integer> inner = new ArrayList<>();
            Set<Integer> keys = map.keySet();
            flag=false;
            for(int i : keys){
                int val=map.get(i);
                if(val!=0){
                    inner.add(i);
                    val--;
                    map.put(i,val);
                    flag=true;
                }  
            }
            if(flag){
                outer.add(inner);
            }
        }
        return outer;
    }
}