class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer lhs,Integer rhs){
                if(lhs<rhs){
                    return +1;
                }
                if(lhs.equals(rhs)){
                    return 0;
                }
                return -1;
            }
        });
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        for(int i=0;i<k-1;i++){
            pq.poll();
        }
        return pq.peek();
    }
}