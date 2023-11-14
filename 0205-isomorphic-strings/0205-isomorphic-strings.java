class Solution {
    public boolean isIsomorphic(String s, String t) {
    // approach 1:
        // Map<Character,Character> map = new HashMap<>();
        // Set<Character> set = new HashSet<>();
        // //traverse s string
        // for(int i=0;i<s.length();i++){
        //     //check map contain character at i in s string , if it contains it means we have mapped that character previously,so check with mapping
        //     if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i))!=t.charAt(i)){
        //             return false;
        //     }
        //     //this case is for s="badc" t="baba" b alresdy map to b and d also try to map with b it is not allow
        //     if(!map.containsKey(s.charAt(i)) && set.contains(t.charAt(i))){
        //         return false;
        //     }
        //     //map character and add in set
        //     map.put(s.charAt(i),t.charAt(i));
        //     set.add(t.charAt(i));
        // }
        // return true;
    // optimise
        
        int map1[]=new int[256];
        int map2[]=new int[256];
        for(int i=0;i<s.length();i++){
            if(map1[s.charAt(i)]!=map2[t.charAt(i)]){
                return false;
            }
            map1[s.charAt(i)]=i+1;
            map2[t.charAt(i)]=i+1;
        }
        return true;
        
    }
}