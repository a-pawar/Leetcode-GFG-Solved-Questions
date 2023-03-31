class Solution {
    public int arrangeCoins(int n) {
        int rowFilled = 0;
        int i=1;
        while(n>0 && i<=n){
            
                rowFilled++;   
            
            n=n-i;
            i++;
        }
        return rowFilled;
    }
}