class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        //one pass sliding window
        int n=answerKey.length();
        int countF=0,countT=0;
        int l=0,r=0,ans=0;
        while(r<n){
            if(answerKey.charAt(r)=='T'){
                countT++;
            }else{
                countF++;
            }
            //flip minimum number
            int min = Math.min(countT,countF);
            //if min is more than k we cannot flip min element so reduce the window
            while(min>k && l<=r){
                if(answerKey.charAt(l)=='T'){
                    countT--;
                }else{
                    countF--;
                }
                 min = Math.min(countT,countF); 
                l++;
            }
            ans = Math.max(ans,r-l+1);
            r++;
            
        }
        return ans;
//         //two pass sliding window
//         int n=answerKey.length();
//         //when F convert to T
//         int count1=0;
//         int l=0,r=0,temp=k;
//         while(r<n){
//             if(answerKey.charAt(r)=='F'){
//                 temp--;
//             }
//             while(temp<0 && l<=r){
//                 if(answerKey.charAt(l)=='F'){
//                     temp++;
//                 }
//                 l++;
//             } 
                
            
//             count1 =Math.max(count1,r-l+1);
//             r++;
//         }
//         //when T convert to F
//         l=0;r=0;temp=k;
//         int count2=0;
//         while(r<n){
//             if(answerKey.charAt(r)=='T'){
//                 temp--;
//             }
//             while(temp<0 && l<=r){
//                 if(answerKey.charAt(l)=='T'){
//                     temp++;
//                 }
//                 l++;
//             } 
                
            
//             count1 =Math.max(count1,r-l+1);
//             r++;
//         }
//         return count1<count2?count2:count1;
    }
}