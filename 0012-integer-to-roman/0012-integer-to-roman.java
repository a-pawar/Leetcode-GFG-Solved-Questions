class Solution {
    public String intToRoman(int num) {
        StringBuilder str = new StringBuilder();
        int [] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String [] s = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV","I"};
        for(int i =0 ; i<nums.length;i++){
            while(nums[i]<= num){
                str.append(s[i]);
                num = num - nums[i];
            }
        }
        return str.toString();
        //other way
        /*
        while(1000<=num){
            str.append("M");
            num = num - 1000;
            
        }
        if(900<=num){
            str.append("CM");
            num = num - 900;
            //num = num % 900;
        }
        if(500<=num){
            str.append("D");
            num = num -500;

        }
        if(400<=num){
            str.append("CD");
            num = num -400;
        }
        while(100<=num){
            str.append("C");
            num = num -100;
        }
        if(90<=num){
            str.append("XC");
            num = num -90;
        }
        if(50<=num){
            str.append("L");
            num = num -50;
        }
        if(40<=num){
            str.append("XL");
            num = num -40;
        }
        while(10<=num){
            str.append("X");
            num = num -10;
        }
        if(9==num){
            str.append("IX");
            num=num-9;
        }
        else if(5<=num){
            str.append("V");
            num=num-5;
        }
        if(4==num){
            str.append("IV");
            num=num-4;
        }
        while(1<=num){
            str.append("I");
            num=num-1;
        }
        return new String(str);
        */
    }
}