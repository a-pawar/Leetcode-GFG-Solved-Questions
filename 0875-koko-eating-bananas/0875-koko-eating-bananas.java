class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }
        
        int start=1,end=max,mid=0;
        while(start<=end){
             mid = (end-start)/2+start;
             int totalHours=0;
            for(int i=0;i<piles.length;i++){
                totalHours += Math.ceil((double)(piles[i])/(double)(mid));
            }
            if(totalHours<=h){
                end = mid-1;
            }else if(totalHours>h){
                start=mid+1;
            }
        }
        return start;
    }
}