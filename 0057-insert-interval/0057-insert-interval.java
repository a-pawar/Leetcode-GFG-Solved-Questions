class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        
        int i=0;
        while(i<intervals.length){
            if(intervals[i][1]<newInterval[0]){
                 ArrayList<Integer> inner = new ArrayList<>();
                inner.add(intervals[i][0]);
                inner.add(intervals[i][1]);
                outer.add(inner);
                
            }
            else if(intervals[i][0] > newInterval[1]){
                break;
            }else{
                //merge
             newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
             newInterval[1]=Math.max(intervals[i][1],newInterval[1]);


            }
            i++;
        }
        ArrayList<Integer> inner1 = new ArrayList<>();
        inner1.add(newInterval[0]);
        inner1.add(newInterval[1]);
        outer.add(inner1);
        while(i<intervals.length){
             ArrayList<Integer> inner = new ArrayList<>();
                inner.add(intervals[i][0]);
                inner.add(intervals[i][1]);
                outer.add(inner);
                i++;
        }
        
        int n = outer.size();
        int [][] ans = new int [n][2];
        int j=0;
        for(ArrayList<Integer> list : outer){
            ans[j][0]=list.get(0);
            ans[j][1]=list.get(1);
            j++;
        }
        return ans;
    }
}