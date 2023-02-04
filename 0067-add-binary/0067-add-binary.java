class Solution {
    public  String addBinary(String a, String b) {
            StringBuilder sb = new StringBuilder();
            int x=a.length()-1;
            int y=b.length()-1;
            int carry=0;
            while(x>=0 && y>=0 ){
                int x1=Character.getNumericValue(a.charAt(x));
                int y1=Character.getNumericValue(b.charAt(y));
                x--;
                y--;
                sb.append(sum(x1,y1,carry));
                carry = carryFun(x1,y1,carry);
            }
            while(x>=0  || y>=0 ){
                int x1=0;
                int y1=0;
                if(x>=0){
                     x1=Character.getNumericValue(a.charAt(x));
                     y1=0;
                }
                else if(y>=0){
                     y1=Character.getNumericValue(b.charAt(y));
                     x1=0;
                }

                x--;
                y--;
                sb.append(sum(x1,y1,carry));
                carry = carryFun(x1,y1,carry);
            }
            if(carry != 0){
                sb.append(1);
            }
            sb.reverse();
            return sb.toString();
        }
       int  sum(int x1,int y1,int carry){

            return (x1+y1+carry)%2;
        }
         int  carryFun(int x1,int y1,int carry){
            return (x1+y1+carry)/2;
        }
}