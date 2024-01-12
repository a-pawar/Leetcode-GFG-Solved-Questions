class Solution {
    public int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int count=0;
        char [] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++ ){
            char ch = arr[i];
            if(ch=='('){
                stack.push(ch);
            }
            else if(ch==')'){
                if(i+1<arr.length && arr[i+1]==')'){
                    if(!stack.isEmpty() && stack.peek()=='('){
                        stack.pop();
                        i++;
                    }else{
                        count++;
                        i++;
                    }
                }else{
                    count++;
                   if(!stack.isEmpty() && stack.peek()=='('){
                        stack.pop();
                    }else{
                        count++;
                    } 
                }
            }
        }
        return 2*stack.size()+count;
    }
}