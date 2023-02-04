class Solution {
    public String convertToTitle(int columnNumber) {
        
       int n = columnNumber;
        String ans ="";
        while(n>0){
            n = n-1;
            int a = n%26;
            char t=(char)(a+65);
            ans = String.valueOf(t)+ans;
            n =(int ) (n /26);
        }
        return ans;
    }
}