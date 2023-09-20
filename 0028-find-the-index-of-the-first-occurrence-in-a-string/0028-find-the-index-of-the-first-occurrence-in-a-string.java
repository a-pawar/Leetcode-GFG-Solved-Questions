class Solution {
    public int strStr(String haystack, String needle) {
//         int i=0,j=0;
//         int store=-1;
//         while(i < haystack.length()){
//             store = i;
//             while(j<needle.length() && i < haystack.length() && haystack.charAt(i)==needle.charAt(j)){
//                 j++;
//                 i++;

//             }
//             if(j == needle.length()){
//                 return store;
//             }
//             j=0;
//             i=store;
//             i++;
//         }
//         return -1;
        int ans = haystack.indexOf(needle);
        return ans;
    }
}