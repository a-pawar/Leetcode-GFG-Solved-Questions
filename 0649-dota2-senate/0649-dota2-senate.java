class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Character> queue = new LinkedList<>();
        int rcount=0,dcount=0;
        for(char ch : senate.toCharArray()){
            queue.add(ch);
            if(ch=='R'){
                rcount++;
            }
            if(ch=='D'){
                dcount++;
            }
        }
        int rban=0,dban=0;
        while(rcount!=0 && dcount!=0){
            char ch = queue.poll();
            if(ch=='D' && dban>0){
                dcount--;
                dban--;
                continue;
            }
            if(ch=='R' && rban>0){
                rcount--;
                rban--;
                continue;
            }
            if(ch=='R'){
                dban++;  
            }
            if(ch=='D'){
                rban++;
            }
            queue.add(ch);
        }
        char ch = queue.poll();
        if(ch=='R'){
            return "Radiant";
        }else{
            return "Dire";
        }
    }
}