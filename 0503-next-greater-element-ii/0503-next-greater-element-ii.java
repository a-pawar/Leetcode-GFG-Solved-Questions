class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int [] ans = new int [nums.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=2*nums.length-1;i>=0;i--){
            
            while(!stack.isEmpty() && stack.peek()<=nums[i%nums.length]){
                stack.pop();
            }
            if(i<nums.length){
                if(stack.isEmpty()){
                ans[i]=-1;
                }else{
                    ans[i]=stack.peek();
                }
            }
            
            stack.push(nums[i%nums.length]);
        }
        return ans;
    }
}