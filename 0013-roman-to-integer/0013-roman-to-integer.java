class Solution {
    public int romanToInt(String s) {
        int num=0;
        int k=s.length();
        for(int i=0;i<k;i++){
            if(i<k-1 && s.substring(i,i+2).equals("CM")){ //condition is to protect arrayindex out of obund
                num = num+900;
                i=i+1;
            }
            else if(i<k-1 && s.substring(i,i+2).equals("CD")){
                num = num+400;
                i=i+1;
            }
            else if(i<k-1 && s.substring(i,i+2).equals("XC")){
                num = num+90;
                i=i+1;
            }
            else if(i<k-1 && s.substring(i,i+2).equals("XL")){
                num = num+40;
                i=i+1;
            }
            else if(i<k-1 &&  s.substring(i,i+2).equals("IX")){ 
                num = num+9;
                i=i+1;
            }
            else if(i<k-1 && s.substring(i,i+2).equals("IV")){
                num = num+4;
                i=i+1;
            }
            else if(s.charAt(i)=='M'){
                num = num+1000;
            }
            else if(s.charAt(i)=='D'){
                num = num+500;
            }
            else if(s.charAt(i)=='C'){
                num = num+100;
            }
            else if(s.charAt(i)=='L'){
                num = num+50;
            }
            else if(s.charAt(i)=='X'){
                num = num+10;
            }
            else if(s.charAt(i)=='V'){
                num = num+5;
            }
            else if(s.charAt(i)=='I'){
                num = num+1;
            }
        }
        return num;
    }
}