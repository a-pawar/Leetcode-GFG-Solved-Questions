class Solution {
    public int firstUniqChar(String str) {
        HashMap<Character,Integer> map = new HashMap<>();
		if(str.length()==0){
			return -1;
		}
        
		for(int i=0;i<str.length();i++){
			if(map.containsKey(str.charAt(i))){
                int val = map.get(str.charAt(i));
                map.put(str.charAt(i),val+1);
				
			}
            else{
                map.put(str.charAt(i), 1);
            }
		}
        for(int i=0;i<str.length();i++){
			if(map.get(str.charAt(i))==1){
                   return i;
            }
		}
		return -1;
    }
}