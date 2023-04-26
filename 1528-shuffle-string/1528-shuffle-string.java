class Solution {
    public String restoreString(String s, int[] indices) {
        char[] arr = s.toCharArray();
        int i=0;
        while(i<indices.length){
            int correctIndex = indices[i];
            if(indices[i] != i){
                //swaps character
                char c = arr[i];
                arr[i] = arr[correctIndex] ;
                arr[correctIndex]= c;
                //swaps indices
                int temp = indices[i];
                indices[i] = indices[correctIndex];
                indices[correctIndex] = temp;
            }
            else{
                i++;
            }
            
        }
       
        return  new String(arr);
    }
}