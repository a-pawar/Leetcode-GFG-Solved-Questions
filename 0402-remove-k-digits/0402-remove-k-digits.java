
class Solution {
    public String removeKdigits(String num, int k) {
        if(k>=num.length()){
            return "0";
        }
        Stack<Integer> stack = new Stack<>();
        for(char ch : num.toCharArray()){
            int temp = ch-'0';
            if(stack.isEmpty()){
                stack.push(temp);
            }else{
                while(!stack.isEmpty() && stack.peek()>temp && k!=0){
                    stack.pop();
                    k--;
                }
                stack.push(temp);
            }

        }
        while(k!=0){
            stack.pop();
            k--;
        }
        StringBuilder ans=new StringBuilder();
        while(!stack.isEmpty()){
            int i = stack.pop();
            ans.insert(0,Integer.toString(i));
            // ans=Integer.toString(i)+ans;
        }
        
        while(ans.length()>0 && ans.charAt(0)=='0'){
           ans.delete(0,1);
        }
        if(ans.length()==0){
            return "0";
        }
        return ans.toString();
    }
}