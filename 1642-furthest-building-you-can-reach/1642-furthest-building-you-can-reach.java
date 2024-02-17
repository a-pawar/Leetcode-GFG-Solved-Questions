class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pQueue= new PriorityQueue<Integer>(
            Collections.reverseOrder());
            int i;
        for( i=0;i<heights.length-1;i++){
            if(heights[i]>=heights[i+1]){
                continue;
            }
            int diff = heights[i+1]-heights[i];
            if(diff<=bricks){
                pQueue.add(diff);
                bricks-=diff;
            }else if(ladders>0){
                if(!pQueue.isEmpty()){
                    int past_max = pQueue.peek();
                    if(diff<past_max){
                        
                        bricks+=past_max;
                        bricks-=diff;
                        pQueue.poll();
                        pQueue.add(diff);

                    }
                        ladders--;
                    
                }else{
                    ladders--;
                }

            }
            else{
                break;
            }
        }
        return i;
             
    }
}