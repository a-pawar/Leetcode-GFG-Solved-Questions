class Solution {
    public String decodeString(String str) {
        String curString ="";
        int curNum = 0;
        String prevString ="";
        int prevNum = 0;
         Stack<Object> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            Boolean flagDigit = Character.isDigit(str.charAt(i));  
            if(flagDigit){
                int temp = curNum;
                curNum = str.charAt(i)-'0';
                temp = temp*10+curNum;
                curNum = temp;
            }
            else if(str.charAt(i)=='['){
                stack.push(curString);
                stack.push(curNum);
                curString="";
                curNum=0;
                 }
            else if(str.charAt(i)==']'){
                
                prevNum =(int) stack.pop();
                prevString =(String) stack.pop();
                String temp = curString.repeat(prevNum);
                curString  = prevString+temp;
                
            }
            else{
                curString = curString+str.charAt(i);
              }
        }
        return curString;
    }
}