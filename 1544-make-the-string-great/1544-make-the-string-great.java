class Solution {
    public String makeGood(String s) {
        if(s.length()==0){
            return s;
        }
        Stack<Character> stk = new Stack<>();
        stk.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(stk.isEmpty()){
                stk.push(s.charAt(i));
                continue;
            }
            char top = stk.peek();
            
            char ch1 =(char) ((int)top-32);
            char ch2 =(char) ((int)s.charAt(i)-32);
            if(s.charAt(i)==ch1 || top==ch2){
                stk.pop();
            }else{
                stk.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty()){
            sb.append(stk.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}