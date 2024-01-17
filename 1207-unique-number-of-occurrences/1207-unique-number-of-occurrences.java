class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:arr){
            if(map.containsKey(i)){
                int val = map.get(i);
                map.put(i,val+1);
            }else{
                map.put(i,1);
            }
        }
        Set<Integer> keys = map.keySet();
        Set<Integer> set = new HashSet<>();
        for(int key : keys){
            int val = map.get(key);
            if(set.contains(val)){
                return false;
            }
            set.add(val);
        }
        return true;
    }
}