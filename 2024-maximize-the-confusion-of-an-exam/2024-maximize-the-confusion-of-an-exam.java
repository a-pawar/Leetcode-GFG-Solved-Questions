class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int n=answerKey.length();
        //when F convert to T
        int count1=0;
        int l=0,r=0,temp=k;
        while(r<n){
            if(answerKey.charAt(r)=='F'){
                temp--;
            }
            while(temp<0 && l<=r){
                if(answerKey.charAt(l)=='F'){
                    temp++;
                }
                l++;
            } 
                
            
            count1 =Math.max(count1,r-l+1);
            r++;
        }
        //when T convert to F
        l=0;r=0;temp=k;
        int count2=0;
        while(r<n){
            if(answerKey.charAt(r)=='T'){
                temp--;
            }
            while(temp<0 && l<=r){
                if(answerKey.charAt(l)=='T'){
                    temp++;
                }
                l++;
            } 
                
            
            count1 =Math.max(count1,r-l+1);
            r++;
        }
        return count1<count2?count2:count1;
    }
}