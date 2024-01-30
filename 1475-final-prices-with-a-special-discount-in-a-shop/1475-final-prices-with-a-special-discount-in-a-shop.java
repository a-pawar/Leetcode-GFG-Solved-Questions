class Solution {
    public int[] finalPrices(int[] prices) {
        int [] ans = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=prices.length-1; i>=0;i--){
            if(stack.isEmpty()){
                stack.push(prices[i]);
                ans[i]=prices[i];
            }else{
                while(!stack.isEmpty() && prices[i]<stack.peek()){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    stack.push(prices[i]);
                    ans[i]=prices[i];
                }else{
                    int afterdis = prices[i]-stack.peek();
                    ans[i]=afterdis;
                    stack.push(prices[i]);
                }

            }
        }
        return ans;
    }
}