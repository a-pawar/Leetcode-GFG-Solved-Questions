class Solution {
    public String reverseWords(String s) {
//         int left=0,right=s.length()-1;

// 				String temp="",ans="";
// 				while(left<=right){
// 					if(s.charAt(left)!=' '){
// 						temp+=s.charAt(left);
// 					}else if(!temp.equals("")){
// 						if(ans.equals("")){
// 							ans = temp;
// 						}else{
// 							ans=temp+" "+ans;
// 						}
// 						temp="";
// 					}
// 					left++;
// 				}
// 				//add last word
// 				if(!temp.equals("")){
// 					if(ans.equals("")){
// 							ans = temp;
// 					}else{
// 						ans=temp+" "+ans;
// 					}
// 				}
// 				return ans;
        
        // Trim the input string to remove leading and trailing spaces
        String[] str = s.trim().split("\\s+");

        // Initialize the output string
        String out = "";

        // Iterate through the words in reverse order
        for (int i = str.length - 1; i > 0; i--) {
            // Append the current word and a space to the output
            out += str[i] + " ";
        }

        // Append the first word to the output (without trailing space)
        return out + str[0];
    }
}