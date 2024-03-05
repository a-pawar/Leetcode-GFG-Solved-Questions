class Solution {
    public int minimumLength(String str) {
        int s=0,e=str.length()-1;

        while(s<e){
            char sch = str.charAt(s);
            char ech = str.charAt(e);
            if(sch==ech){
                s++;
                while(s<e && sch==str.charAt(s)){
                    s++;
                }
                e--;
                while( s<e && ech==str.charAt(e)){
                    e--;
                }
            }else{
                break;
            }
        }
        return e-s+1;
    }
}