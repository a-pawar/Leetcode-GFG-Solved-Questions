public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int result =0;
        while(n!=0){
            //every time list lbb 1 bit turn to 0
            n = n & n-1;
            result++;
        }
        return result;
        
    }
}