class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> outerList = new ArrayList<List<Integer>>();
        List<Integer> innerList1 = new ArrayList<>();
        List<Integer> innerList2 = new ArrayList<>();
        
        Set<Integer> set = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<matches.length;i++){
            set.add(matches[i][0]);
            int key=matches[i][1];
            if(map.containsKey(key)){
                int val = map.get(key);
                val++;
                map.put(key,val);
            }else{
                map.put(key,1);
            }
        }
        for(int winner : set){
            //means he does not lost match
            if(!map.containsKey(winner)){
                innerList1.add(winner);
            }
        }
        Set<Integer> keys = map.keySet();
        for(int loser : keys){
            int val = map.get(loser);
            if(val==1){
                innerList2.add(loser);
            }
        }
        
        Collections.sort(innerList1);
        Collections.sort(innerList2);
        outerList.add(innerList1);
        outerList.add(innerList2);
        return outerList;
    }
}