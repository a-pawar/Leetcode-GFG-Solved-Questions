class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0,j=0,ans=0;
        while(j<s.length()){
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                while(i<=j && s.charAt(i)!=ch){
                    map.remove(s.charAt(i));
                    i++;
                }
                map.remove(ch);
                i++;
            }else{
                map.put(ch,1);
                j++;
                int curlen = j-i;
                if(ans<curlen){
                    ans=curlen;
                }
            }
        }
        return ans;
    }
}