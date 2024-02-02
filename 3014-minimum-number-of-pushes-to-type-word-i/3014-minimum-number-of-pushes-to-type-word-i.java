class Solution {
    public int minimumPushes(String word) {
        int len = word.length();
        int pressTime=1;
        int ans=0;
        while(len>0){
            if(len<=8){
                ans=ans+len*pressTime;
                return ans;
            }else {
                ans = ans+pressTime*8;
                len=len-8;
                pressTime++;
            }
        }
        return -1;
    }
}