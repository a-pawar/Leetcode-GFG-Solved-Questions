class Solution {
    public List<String> letterCombinations(String digits) {
        return padLeetCode("",digits);
    }
    public static ArrayList<String> padLeetCode(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>() ;
            if(!p.isEmpty()){
                list.add(p);
            }
            return list;
        }
        int n = up.charAt(0)-'0';
        ArrayList<String> list = new ArrayList<>();
        if(n<7){
            for(int i = (n-2)*3;i<(n-1)*3;i++){
            char ch = (char)('a'+i);
            ArrayList<String> l1=padLeetCode(p+ch,up.substring(1));
            list.addAll(l1);
            }
        }
        else if(n==7){
            for(int i = (n-2)*3;i<=(n-1)*3;i++){
            char ch = (char)('a'+i);
            ArrayList<String> l1=padLeetCode(p+ch,up.substring(1));
            list.addAll(l1);
            }
        }
        else if(n==8){
            for(int i = (n-2)*3+1;i<=(n-1)*3;i++){
            char ch = (char)('a'+i);
            ArrayList<String> l1=padLeetCode(p+ch,up.substring(1));
            list.addAll(l1);
            }
        }else if(n==9){
            for(int i = (n-2)*3+1;i<=(n-1)*3+1;i++){
            char ch = (char)('a'+i);
            ArrayList<String> l1=padLeetCode(p+ch,up.substring(1));
            list.addAll(l1);
            }
        }
        
        return list;
    }
    
}