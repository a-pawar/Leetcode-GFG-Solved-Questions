class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map = new HashMap<>();
        Map< String,Character> map1 = new HashMap<>();
        String str = "";
        int j=0;
        for(int i=0;i<pattern.length();i++){
            str = "";
            while( j<s.length() && s.charAt(j)!=' ' ){
                str=str+s.charAt(j);
                j++;
            }
            j++;
            if(map.containsKey(pattern.charAt(i))){
                String temp = map.get(pattern.charAt(i));
                if(!temp.equals(str)){
                    return false;
                }

            }
            else{
                map.put(pattern.charAt(i),str);
            }
            if(map1.containsKey(str)){
                char temp = map1.get(str);
                if(temp != pattern.charAt(i)){
                    return false;
                }

            }
            else{
                map1.put(str, pattern.charAt(i));
            }

        }
        System.out.print(j);
        if(j-1!=s.length()){
            return false;
        }
        return true;
    }
}