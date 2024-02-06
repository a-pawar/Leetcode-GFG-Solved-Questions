class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<String,List<String>>();
        List<List<String>> ans = new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            String word = strs[i];
            char [] chararr = word.toCharArray();
            Arrays.sort(chararr);
            String sortedword = new String(chararr);
            if(map.containsKey(sortedword)){
                List<String> list = map.get(sortedword);
                list.add(word);
                map.put(sortedword,list);
            }else{
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(sortedword,list);
            }
        }
        Set<String> keys = map.keySet();
        for(String key : keys){
            ans.add(map.get(key));
        }
        return ans;
    }
}