class Solution {
    public int beautySum(String s) {
        int sum=0;
        Map<Character,Integer> map;
        for(int i=0;i<s.length();i++){
            map=new HashMap<>();
            for(int j=i;j<s.length();j++){
                //for every substring
                int [] arr=calculateDifference(s,i,j,map);
                //arr[0] ---least  arr[1]----most
                
                sum=sum+(arr[1]-arr[0]);
            }
        }
        return sum;
    }
    public int[] calculateDifference(String s,int i,int j,Map<Character,Integer> map){
        
        int least=Integer.MAX_VALUE,most=Integer.MIN_VALUE;
        //traverse substring //map each character
        // while(i<=j){
            char ch=s.charAt(j);
            if(map.containsKey(ch)){
                int val = map.get(ch);
                map.put(ch,val+1);
            }else{
                map.put(ch,1);
            }
            // i++;
        // }
        Set<Character> keys =  map.keySet();
        for(char key:keys){
            int val = map.get(key);
            if(val<least){
                least=val;
            }
            if(val>most){
                most=val;
            }
            
        }
        return new int[]{least,most};
    }
}