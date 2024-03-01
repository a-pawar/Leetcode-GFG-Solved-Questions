class Solution {
    public String maximumOddBinaryNumber(String s) {
        int countOne=0;
        for(char ch : s.toCharArray()){
            if(ch=='1'){
                countOne++;
            }
        }
        int countZero=s.length()-countOne;
        String ans="";
        while(countOne>1){
            ans=ans+'1';
            countOne--;
        }
        while(countZero>0){
            ans=ans+'0';
            countZero--;
        }
        ans=ans+'1';
        return ans;
        
        
        
    }
}