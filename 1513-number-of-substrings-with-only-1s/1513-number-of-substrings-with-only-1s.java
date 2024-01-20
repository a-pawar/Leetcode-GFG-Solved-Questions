class Solution {
    public int numSub(String s) {
        long result =0;
        int current_streak = 0;
        long mod = 1000000007;
        for(char c : s.toCharArray()){
            if(c=='1') result += ++current_streak;
            else current_streak=0;
        }
        return (int)(result%mod);
        
    }
}