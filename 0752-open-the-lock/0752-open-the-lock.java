class Solution {
    
    public int openLock(String[] deadends, String target) {

        Queue<String> q = new LinkedList<>();
        HashSet<String> dead = new HashSet<>(Arrays.asList(deadends));
        HashSet<String> visited = new HashSet<>();
        q.add("0000");
        visited.add("0000");
        int ans = 0;
        while(q.size()!=0){
            int n = q.size();
            for(int i=0; i<n; i++){
                String s = q.remove();
                if(dead.contains(s)) continue;
                if(s.equals(target)) return ans;

                for(int j=0; j<4; j++){
                    char ch = s.charAt(j);
                    String s1 = s.substring(0,j) + (ch=='9' ? "0" : (char)((int)ch+1)+"") + s.substring(j+1);
                    String s2 = s.substring(0,j) + (ch=='0' ? "9" : (char)((int)ch-1)+"") + s.substring(j+1);
                    
                    if(!visited.contains(s1) && !dead.contains(s1)){
                        q.add(s1);
                        visited.add(s1);
                    }

                    if(!visited.contains(s2) && !dead.contains(s2)){
                        q.add(s2);
                        visited.add(s2);
                    }
                }
            }
            ans++;
        }
        return -1;
    }
}