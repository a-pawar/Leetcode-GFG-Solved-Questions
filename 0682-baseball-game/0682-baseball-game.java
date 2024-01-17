class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String s : operations){
            if(s.equals("+")){
                int pop1 = stack.pop();
                int peek = stack.peek();
                int sum = pop1+peek;
                stack.push(pop1);
                stack.push(sum);
            }else if(s.equals("C")){
                stack.pop();
            }else if(s.equals("D")){
                int peek = stack.peek();
                stack.push(2*peek);
            }else{
                int temp = Integer.parseInt(s);
                stack.push(temp);
            }

        }
        int ans = 0;
        while(!stack.isEmpty()){
            ans+= stack.pop();
        }
        return ans;
    }
}