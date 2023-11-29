class Solution {
    public int titleToNumber(String columnTitle) {
        int ans=0;
        for(int i=0;i<columnTitle.length();i++){
            int temp =columnTitle.charAt(i)-64;
            
            ans = ans*26+temp;
        }
        return ans;
            
    }
}