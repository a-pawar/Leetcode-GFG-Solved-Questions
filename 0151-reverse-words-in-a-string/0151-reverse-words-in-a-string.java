class Solution {
    public String reverseWords(String s) {
        int left=0,right=s.length()-1;

				String temp="",ans="";
				while(left<=right){
					if(s.charAt(left)!=' '){
						temp+=s.charAt(left);
					}else if(!temp.equals("")){
						if(ans.equals("")){
							ans = temp;
						}else{
							ans=temp+" "+ans;
						}
						temp="";
					}
					left++;
				}
				//add last word
				if(!temp.equals("")){
					if(ans.equals("")){
							ans = temp;
					}else{
						ans=temp+" "+ans;
					}
				}
				return ans;
    }
}