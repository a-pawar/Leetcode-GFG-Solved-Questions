class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        for(char ch : word1.toCharArray()){
            int index = ch-97;
            arr1[index]=arr1[index]+1;
        }
        
        for(char ch : word2.toCharArray()){
            int index = ch-97;
            arr2[index]=arr2[index]+1;
        }
        for(int i=0;i<26;i++){
            int req = arr2[i];
            if(arr1[i]==req){
                continue;
            }
            
            if(arr1[i]==0 ){
                if(req!=0){
                    return false;
                }
            }
            if(req==0){
                if(arr1[i]!=0){
                    return false;
                }
            }
            
            for(int j=i+1;j<26;j++){
                if(arr1[j]==req){
                    int temp = arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }

        }
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }

}