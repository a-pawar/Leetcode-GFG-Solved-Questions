//A 32-bit signed integer. It has a minimum value of -2,147,483,648 and a maximum value of 2,147,483,647 (inclusive)
class Solution {
    public int myAtoi(String s) {
        int ans=0;
        int i=0;
        boolean isNegative=false;
        //only ignore leading whitespace
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        char ch=' ';
        if(i<s.length()){
             ch= s.charAt(i);
            if(ch=='-'){
                isNegative=true;
                i++;
            } else if(ch=='+'){
                isNegative=false;
                i++;
            }
        }
        for(int j=i;j<s.length();j++){
            //check sign
             ch= s.charAt(j);
            if(Character.isDigit(ch)){
                int val = ch-'0';
                //avoid integer overflow
                if((ans>Integer.MAX_VALUE/10) || (ans==Integer.MAX_VALUE/10) && val>7){   
                    return isNegative?Integer.MIN_VALUE :Integer.MAX_VALUE;

                }
                ans=(ans*10)+val;
            }else{
                break;
            }
        }
        return isNegative?(-1)*ans:ans;
    }
}