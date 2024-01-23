class Solution {
    public int maxLength(List<String> arr) {
        return maxLengthHelper(arr,0,"");
    }
    public int maxLengthHelper(List<String> arr , int i , String stringsofar){
        if(arr.size()==i){
            return stringsofar.length();
        }
        boolean dup = hasDuplicate(stringsofar,arr.get(i));
        //include
        int includeans=-1;
        if(!dup){
            includeans= maxLengthHelper(arr,i+1,stringsofar+arr.get(i));
        }
        int excludeans = maxLengthHelper(arr,i+1,stringsofar);
        return Math.max(includeans,excludeans);

    }
    public boolean hasDuplicate(String s1 , String s2){
        int [] charr= new int[26];
        for(char ch : s1.toCharArray()){
            int index = ch;
            index=index-97;
            if(charr[index]>0){
                return true;
            }
            charr[index]=1;

        }
        for(char ch : s2.toCharArray()){
            int index = ch;
            index=index-97;
            if(charr[index]>0){
                return true;
            }
            charr[index]=1;

        }
        return false;
    }
}