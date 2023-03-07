class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l1 = new ArrayList<Boolean>();
        int max=Math.round(Integer.MIN_VALUE*100);
        for(int i=0;i<candies.length;i++){
            max = Math.max(max,candies[i]);
        }
        int i=0;
        for(int c : candies){
            int total=c+extraCandies;
            if(total>=max){
                l1.add(true);
                
            }
            else{
                l1.add(false);
            }
        }
        return l1;
    }
}