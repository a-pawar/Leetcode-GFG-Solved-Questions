class Solution {
    public int minSteps(String s, String t) {
        int [] arr = new int[26];
        for(char ch : s.toCharArray()){
            int index = ch-97;
            arr[index]=arr[index]+1;
        }
        for(char ch : t.toCharArray()){
            int index = ch-97;
            if(arr[index]!=0){
                arr[index]=arr[index]-1;
            }   
        }
        int count=0;
        for(int i=0;i<26;i++){
            count+=arr[i];
        }
        return count;


    }
}