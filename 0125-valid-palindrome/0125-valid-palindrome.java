class Solution {
    public boolean isPalindrome(String s) {
        // String str = removeSpaceSpecialchar(s);
        String str = s.toLowerCase();
        int start=0;
        int end = str.length()-1;

        while(start<end){
            while((start<end)&& !(97<=str.charAt(start) && str.charAt(start)<=122 || 48<=str.charAt(start) && str.charAt(start)<=57)){
                start++;
            }
            while((start<end)&& !(97<=str.charAt(end) && str.charAt(end)<=122 || 48<=str.charAt(end) && str.charAt(end)<=57)){
                end--;
            }
            if( start<end&& str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    // public String removeSpaceSpecialchar(String str1){
        
    //     StringBuilder sb = new StringBuilder();
    //     for(int i=0;i<str1.length();i++){
    //         if(97<=str1.charAt(i) && str1.charAt(i)<=122 || 48<=str1.charAt(i) && str1.charAt(i)<=57){
    //             sb.append(str1.charAt(i));
    //         }
    //         else if(65<=str1.charAt(i) && str1.charAt(i)<=90){
    //             sb.append((char)str1.charAt(i)+32);
    //         }
    //     }
    //     return sb.toString();
    // }
}