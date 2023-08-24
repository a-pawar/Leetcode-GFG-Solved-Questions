class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];
        int curProfit=0;
        
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
            }
             curProfit =prices[i]-min; 
                 
            if(curProfit>profit){
                profit=curProfit;
            }
        }
        return profit;
        
    }
}