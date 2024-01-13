import java.util.StringTokenizer;  
class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        
        StringTokenizer st = new StringTokenizer(path,"/");
        while(st.hasMoreTokens()){
            String token = st.nextToken();
            if(token.length()==0 || token.equals(".")){
                continue;
            }
            if(token.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
                continue;
                
            }
            stack.push(token);
        }
        String ans = "";
        while(!stack.isEmpty()){
            ans = "/"+stack.pop()+ans;
        }
        if(ans.length()==0){
            ans = "/";
        }
       
        return ans;
    }
}