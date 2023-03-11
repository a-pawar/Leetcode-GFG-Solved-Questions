class Solution {
    public boolean checkIfPangram(String sentence) {
        int count=0;
        /*
        for(int i=97;i<=122;i++){
            for(int j=0;j<sentence.length();j++){
                int a = sentence.charAt(j);
                if(i==a){
                    count++;
                    break;
                }
                
            }

        }
        if(count==26){
             return true;
        }
        return false;
        */
        Set<Character> hs = new HashSet<Character>();
        for(int j=0;j<sentence.length();j++){
                Character ch = sentence.charAt(j);
                    
                hs.add(ch);
                
        }
        if(hs.size()==26){
             return true;
        }
        return false;
        
       
    }
}