class Solution {
    public String[] findWords(String[] words) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('q',1);
        map.put('w',1);
        map.put('e',1);
        map.put('r',1);
        map.put('t',1);
        map.put('y',1);
        map.put('u',1);
        map.put('i',1);
        map.put('o',1);
        map.put('p',1);
        map.put('a',2);
        map.put('s',2);
        map.put('d',2);
        map.put('f',2);
        map.put('g',2);
        map.put('h',2);
        map.put('j',2);
        map.put('k',2);
        map.put('l',2);
        map.put('z',3);
        map.put('x',3);
        map.put('c',3);
        map.put('v',3);
        map.put('b',3);
        map.put('n',3);
        map.put('m',3);

        boolean [] bool= new boolean[words.length];
        int index=0;
        for(int i=0;i<words.length;i++){
            String temp = words[i];
            temp=temp.toLowerCase();
            
            int row = map.get(temp.charAt(0));
            int j=1;
            while(j<temp.length() && row ==map.get(temp.charAt(j))){
                j++;
            }
            if(j==temp.length()){
                bool[i]=true;
                index++;
            }

        }
        String[] ans = new String[index];
        int k=0;
        for(int i=0;i<words.length;i++){
            if(bool[i]){
                ans[k++]=words[i];
            }
        }
        return ans;
    }
}