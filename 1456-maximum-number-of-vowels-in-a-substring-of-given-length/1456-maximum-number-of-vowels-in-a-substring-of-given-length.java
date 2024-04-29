class Solution {
    public int maxVowels(String s, int k) {
        int n =s.length();
        int l=0,r=0,ans=0,countvowel=0;
        while(r<n){
            if(isVowel(s.charAt(r))){
                countvowel++;
            }
            while(r-l+1>k){
                if(isVowel(s.charAt(l))){
                    countvowel--;
                }
                l++;
            }
            ans = Math.max(ans,countvowel);  
            if(ans==k){
                return ans;
            }          
            r++;
        }
        return ans;
    }
    public boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }

}