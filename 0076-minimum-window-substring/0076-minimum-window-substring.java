class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()){
            return "";
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : t.toCharArray() ){
            if(map.containsKey(ch)){
                int val = map.get(ch);
                map.put(ch,val+1);
            }else{
                map.put(ch,1);
            }
        }
        int i=0,j=0,start_i=-1,minWindow=Integer.MAX_VALUE;
        int countRequired=t.length();
        while(j<s.length()){
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                int val = map.get(ch);
                if(val>0){
                    countRequired--;  
                }
                map.put(ch,val-1);
                
            }else{
                map.put(ch,-1);
            }
            //if window contains all t string char
            
                while(countRequired==0){
                    int curr_wind_size=j-i+1;
                    if(curr_wind_size<minWindow){
                        minWindow=curr_wind_size;
                        start_i = i;
                    }
                   char ch1 = s.charAt(i); 
                   int val1 = map.get(ch1);
                   val1=val1+1;
                    map.put(ch1,val1); 
                   if(val1>0){
                       countRequired++;
                   } 
                   i++; 
                }
            j++;
        }
        if(start_i==-1){
            return "";
        }
        String ans = s.substring(start_i,start_i+minWindow);
        return ans;
        
    }
}