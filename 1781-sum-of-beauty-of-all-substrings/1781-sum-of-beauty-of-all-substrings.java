class Solution {
    public int beautySum(String s) {
        int least=Integer.MAX_VALUE,most=Integer.MIN_VALUE;
        int sum=0, beuty=0;
        int [] freq;
        for(int i=0;i<s.length();i++){
             freq=new int[26];
            for(int j=i;j<s.length();j++){
                //for every substring
                freq[s.charAt(j)-'a']++;
                for(int k=0;k<26;k++){
                    if(freq[k]<least && freq[k]!=0){
                        least=freq[k];
                    }
                    if(freq[k]>most && freq[k]!=0){
                        most=freq[k];
                    }
                }
                beuty=most-least;
                sum = sum+beuty;
                least=Integer.MAX_VALUE;most=Integer.MIN_VALUE;
            }
        }
        return sum;
    }
}
