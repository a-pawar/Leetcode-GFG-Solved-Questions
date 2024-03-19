class Solution {
    public int leastInterval(char[] tasks, int n) {
        int ans = 0;
        int [] arr = new int [26];
        for(int i=0;i< tasks.length;i++){
            int index=tasks[i]-65;
            arr[index]++;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer> (){
            public int compare(Integer lhs,Integer rhs){
                if(lhs<rhs) return 1;
                if(lhs.equals(rhs)) return 0;
                return -1;
            }
        });
        for(int i=0;i< 26;i++){
            if(arr[i]>0){
                pq.add(arr[i]);
            }   
                
        }
        while(!pq.isEmpty()){
            ArrayList<Integer> list =new ArrayList<>();
            for(int i=1;i<=n+1;i++){
                if(!pq.isEmpty()){
                    int freq = pq.peek();
                    pq.poll();
                    freq--;
                    list.add(freq);

                }
            }
            for(int temp : list){
                if(temp>0){
                    pq.add(temp);
                }
            }
            if(pq.isEmpty()){
                ans+= list.size();
            }else{
                ans+= n+1;
            }

        }
        
        return ans;
        
    }
}