class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int start=1,end=findMax(piles),mid=0;
        while(start<=end){
             mid = (end-start)/2+start;
             int totalHours=calculateTotalHours(piles,mid);
            if(totalHours<=h){
                end = mid-1;
            }else if(totalHours>h){
                start=mid+1;
            }
        }
        return start;
    }
    public int findMax(int[] piles) {
        int maxi = Integer.MIN_VALUE;;
        int n = piles.length;
        //find the maximum:
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, piles[i]);
        }
        return maxi;
    }
    public int calculateTotalHours(int[] piles, int hourly) {
        int totalH = 0;
        int n = piles.length;
        //find total hours:
        for (int i = 0; i < n; i++) {
            totalH += Math.ceil((double)(piles[i]) / (double)(hourly));
        }
        return totalH;
    }

}