class Solution {
    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch=='B' && !stack.isEmpty() && stack.peek()=='A'){
                stack.pop();
                continue;
            }
            if(ch=='D' && !stack.isEmpty() && stack.peek()=='C'){
                stack.pop();
                continue;
            }
            stack.push(ch);
        }
        return stack.size();
    }
}