class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int temp = 0;
        for(int i=0;i<gain.length;i++){
            temp = temp+gain[i];
            if(max<temp){
                max=temp;
            }
        }
        
        return max;
    }
}