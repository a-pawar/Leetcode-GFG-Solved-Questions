class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i=1;i<=n;i++){
            queue.add(i);
        }
        int count=1;
        while(queue.size()>1){
            if(count==k){
                queue.poll();
                count=1;
            }else{
                queue.add(queue.poll());
                count++;
            }
        }
        return queue.poll();
    }
}