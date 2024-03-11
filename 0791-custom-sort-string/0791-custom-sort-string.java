class Solution {
    public String customSortString(String order, String s) {
        int [] charar = new int[26];
        for(int i=0;i<s.length();i++){
            int index=s.charAt(i)-97;
            charar[index]++;

        }
        StringBuilder sb = new StringBuilder();
        for(int j=0;j<order.length();j++){
            char ch = order.charAt(j);
            int index=ch-97;
            while(charar[index]>0){
                sb.append(ch);
                charar[index]--;
            }
        }
        for(int k=0;k<26;k++){
            int index=k+97;
            char ch =(char)index;
            while(charar[k]>0){

                sb.append(ch);
                charar[k]--;
            }
        }
        return sb.toString();
    }
}