class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch=='*'){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        String ans = "";
        while(!stack.isEmpty()){
            ans = stack.pop() + ans;
        }
        return ans;
    }
}