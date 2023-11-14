class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        // String temp = s;
        // for(int i=0;i<s.length();i++){
        //     temp = s.substring(i,s.length())+s.substring(0,i);
        //     // System.out.println(temp);
        //     if(goal.equals(temp)){
        //         return true;
        //     }
        // }
        // return false;
        
        //traverse the s string
        for(int i=0;i<s.length();i++){
            //if any char at s is equal to first char at goal so it might be same//abcde  cdeab
            //c==c
           if(s.charAt(i)==goal.charAt(0)){
               //temps=cde
               String temps = s.substring(i,s.length());
               //tepmsg=cde
               String tempg = goal.substring(0,temps.length());
               //temps2=ab
               String temps2 = s.substring(0,i);
               //tempg2=ab
               String tempg2 = goal.substring(tempg.length(),goal.length());
                
               if(temps.equals(tempg) && temps2.equals(tempg2)){
                   return true;
               }
           }  
        }
        return false;
    }
}