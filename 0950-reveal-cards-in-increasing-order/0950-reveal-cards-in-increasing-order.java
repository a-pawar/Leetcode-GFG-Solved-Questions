class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Arrays.sort(deck);
       Queue<Integer> q =new LinkedList<>();
       for(int i=0;i<n;i++){
            q.add(i);
       } 
       int j=0;
       int [] ans = new int[n];
       while(!q.isEmpty()){
            int index = q.poll();
            ans[index]=deck[j++];
            if(!q.isEmpty()){
                q.add(q.poll());
            }
       }
       return ans;
    }
}