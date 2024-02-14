class Solution {
    public String multiply(String num1, String num2) {
        int n1 = num1.length(),n2=num2.length();
        //check first string is zero
        if(num1.charAt(0)=='0' || num2.charAt(0)=='0'){
            return "0";
        }
        int [] product =new int [n1+n2];
        //multiply
        for(int i=n1-1;i>=0;i--){
            for(int j=n2-1;j>=0;j--){
                int dig1 = num1.charAt(i)-'0';
                int dig2 = num2.charAt(j)-'0';
                product[i+j+1] += dig1*dig2;
            }
        }
        //resolve carry
        int carry=0;
        for(int i=product.length-1;i>=0;i--){
            product[i] += carry;
            int rem = product[i]%10;
            carry = product[i]/10;
            product[i]=rem;
        }
        //convert in string
        String ans ="";
        for(int temp : product){
            
            ans = ans + temp;
        }
        //remove leading zero
        int count=0;
        for(int i=0;i<ans.length();i++){
            if(ans.charAt(i)!='0'){
                break;
            }
            count++;
        }
        ans = ans.substring(count);
        return ans;


    }
}