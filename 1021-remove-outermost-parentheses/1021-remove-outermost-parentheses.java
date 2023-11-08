class Solution {
    public String removeOuterParentheses(String s) {
        Stack stk = new Stack();
        StringBuffer ans=new StringBuffer("");
        for(int i=0;i<s.length();i++){
            if(stk.empty() && s.charAt(i)=='('){
                
                stk.push(s.charAt(i)=='(');
                continue;
            }
            if( s.charAt(i)=='('){
                ans.append("(");
                stk.push(s.charAt(i));
            }
            if( s.charAt(i)==')'){
                stk.pop();
                if(!stk.empty()){
                    ans.append(")");
                }
            }  
        }
        return ans.toString();
    }
}