class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s : tokens){
            if(s.equals("+")){
                int b=stack.pop();
                int a = stack.pop();
                int res =a+b;
                stack.push(res);
            }else if(s.equals("-")){
                int b=stack.pop();
                int a = stack.pop();
                int res =a-b;
                stack.push(res);
            }else if(s.equals("*")){
                int b=stack.pop();
                int a = stack.pop();
                int res =a*b;
                stack.push(res);
            }else if(s.equals("/")){
                int b=stack.pop();
                int a = stack.pop();
                int res =a/b;
                stack.push(res);
            }else{
                int dig = Integer.parseInt(s);
                stack.push(dig);
            }
        }
        return stack.pop();
    }
}