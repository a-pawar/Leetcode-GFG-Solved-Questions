class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> queue =new LinkedList<>();
        for(int i=0;i<tickets.length;i++){
            queue.add(i);
        }
        int ans=0;
        while(!queue.isEmpty()){
            int index = queue.poll();
            tickets[index]--;
            ans++;
            if(tickets[index]==0 && k==index){
                return ans;
            }
            if(tickets[index]>0){
                queue.add(index);
            }
        }
        return ans;
    }
}