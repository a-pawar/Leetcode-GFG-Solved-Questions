class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map = new HashMap<>();
        Map<Character,Character> map1 = new HashMap<>();
        
        map.put(s.charAt(0),t.charAt(0));
        map1.put(t.charAt(0),s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                char ch = map.get(s.charAt(i));
                if(ch!=t.charAt(i)){
                    return false;
                }
            }
            else{
              map.put(s.charAt(i),t.charAt(i));  
            }
            if(map1.containsKey(t.charAt(i))){
                char ch = map1.get(t.charAt(i));
                if(ch!=s.charAt(i)){
                    return false;
                }
            }
            else{
              map1.put(t.charAt(i),s.charAt(i));  
            }
        }
        
        
        return true;

    }
}