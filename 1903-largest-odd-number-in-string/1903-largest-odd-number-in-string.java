class Solution {
    public String largestOddNumber(String num) {
        int count=0;
        for(int i=num.length()-1;i>=0;i--){
            int a = num.charAt(i)-'0';
            if(a%2==0){
                count++;
            }else{
                break;
            }
        }
        return num.substring(0,num.length()-count);
    }
}