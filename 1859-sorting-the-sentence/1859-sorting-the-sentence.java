class Solution {
    public String sortSentence(String s) {
        
        String [] str = s.split(" ");
        int i=0;
        
        while(i < str.length){
            int correctIndex = Integer.parseInt(str[i].substring(str[i].length()-1))-1;
            if(i != correctIndex){
                String temp = str[i];
                str[i] = str[correctIndex];
                str[correctIndex] = temp;
            }
            else{
                
                
                i++;
            }
        }
        StringBuilder ans = new StringBuilder();
        for(int j=0;j<str.length;j++){

            ans.append(str[j].substring(0,str[j].length()-1));
            if(j<str.length-1){
                ans.append(" ");
            }
            
        }
        return new String(ans);
    }
}