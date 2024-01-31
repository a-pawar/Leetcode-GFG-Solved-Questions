class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> stack = new Stack<>();
        int [] ans = new int[n];
        for(int i=n-1 ; i>=0; i--){
            if(stack.isEmpty()){
                ans[i]=0;
            }else{
                while(!stack.isEmpty() && temperatures[i]>=temperatures[stack.peek()]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    ans[i]=0;
                }else{
                    int topindex = stack.peek();
                    ans[i] =  topindex-i;
                }
            }
            stack.push(i);
        }
        return ans;
    }
}