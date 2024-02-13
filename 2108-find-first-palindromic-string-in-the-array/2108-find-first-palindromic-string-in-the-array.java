class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            String str = words[i];
            if(isPallindrome(str)){
                return str;
            }
        }
        return "";
    }
    public boolean isPallindrome(String str){
        // char [] charr = str.toCharArray();
        
        int s=0,e=str.length()-1;
        // while(s<e){
        //     if(charr[s]!=charr[e]){
        //         return false;
        //     }
        //     s++;
        //     e--;
        // }
        while(s<e){
            if(str.charAt(s)!=str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}