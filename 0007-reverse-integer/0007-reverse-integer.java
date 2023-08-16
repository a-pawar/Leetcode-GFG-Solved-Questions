class Solution {
    public int reverse(int x) {
        long rev=0;
        boolean neg = false;
        if(x<0){
            x = Math.abs(x);
            neg = true;
        }
        while(x>0){
            int rem = x%10;
            rev = rev*10 + rem;
            x = x/10;
        }
        if(neg){
            rev = rev*-1;
        }
        if(rev<Integer.MIN_VALUE || Integer.MAX_VALUE<rev){
            return 0;
        }
        return (int)rev;
    }
}