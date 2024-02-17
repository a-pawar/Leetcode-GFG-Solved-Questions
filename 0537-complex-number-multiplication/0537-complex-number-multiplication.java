class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        //real part
        boolean num1RealIsNeg=false;
        if(num1.charAt(0)=='-'){
            num1RealIsNeg=true;
            num1 = num1.substring(1);
        }
        boolean num2RealIsNeg=false;
        if(num2.charAt(0)=='-'){
            num2RealIsNeg=true;
            num2=num2.substring(1);
        }
        int num1real = 0;
        while(num1.charAt(0)!='+'){
            int temp = num1.charAt(0)-'0';
            num1real = num1real*10+temp;
            num1 = num1.substring(1);
        }
        num1 = num1.substring(1);
        int num2real = 0;
        while(num2.charAt(0)!='+'){
            int temp = num2.charAt(0)-'0';
            num2real = num2real*10+temp;
            num2 = num2.substring(1);
        }
        num2 = num2.substring(1);
        //imaginary part
        boolean num1ImgIsNeg=false;
        if(num1.charAt(0)=='-'){
            num1ImgIsNeg=true;
            num1 = num1.substring(1);
        }
        boolean num2ImgIsNeg=false;
        if(num2.charAt(0)=='-'){
            num2ImgIsNeg=true;
            num2=num2.substring(1);
        }
        int num1img = 0;
        while(num1.charAt(0)!='i'){
            int temp = num1.charAt(0)-'0';
            num1img = num1img*10+temp;
            num1 = num1.substring(1);
        }
        
        int num2img = 0;
        while(num2.charAt(0)!='i'){
            int temp = num2.charAt(0)-'0';
            num2img = num2img*10+temp;
            num2 = num2.substring(1);
        }
        //find product real
        int productreal = num1real*num2real;
        if(num1RealIsNeg&&!num2RealIsNeg || !num1RealIsNeg &&num2RealIsNeg){
            productreal=productreal*-1;
        }
        int productimg = num1img*num2img;
        if(num1ImgIsNeg&&!num2ImgIsNeg || !num1ImgIsNeg &&num2ImgIsNeg){
            productimg=productimg*-1;
        }
        int resultReal = productreal-productimg;
        int crossprduct1 = num1real*num2img;
        if(num1RealIsNeg&&!num2ImgIsNeg || !num1RealIsNeg &&num2ImgIsNeg){
            crossprduct1=crossprduct1*-1;
        }
        int crossprduct2 = num1img*num2real;
        if(num1ImgIsNeg&&!num2RealIsNeg || !num1ImgIsNeg &&num2RealIsNeg){
            crossprduct2=crossprduct2*-1;
        }
        int resultImg = crossprduct1+crossprduct2;

        String ans = Integer.toString(resultReal)+"+"+Integer.toString(resultImg)+"i";
        return ans;
        
    







    }
}