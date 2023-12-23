class Solution {
    public boolean squareIsWhite(String coordinates) {
        int n1 = coordinates.charAt(0)-96;
        int n2 = coordinates.charAt(1)-'0';
        //if one is odd and other is even so it is white and one is even and other is odd so it is black
        if(n1%2==0 && n2%2!=0 || n1%2!=0 && n2%2==0){
            return true;
        }
        return false;
    }
}