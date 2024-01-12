class Solution {
    public boolean halvesAreAlike(String s) {
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        
        int n = s.length();
        int count1=0;
        int count2=0;
        for(int i=0;i<n/2;i++){
            if(set.contains(s.charAt(i))){
                count1++;
            }
        }
        for(int i=n/2;i<n;i++){
            if(set.contains(s.charAt(i))){
                count2++;
            }
        }
        return count1==count2;
        
    }
}