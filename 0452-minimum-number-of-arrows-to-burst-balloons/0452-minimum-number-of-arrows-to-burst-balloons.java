class Solution {
    public int findMinArrowShots(int[][] points) {
        int ans=0;
         Arrays.sort(points, new Comparator<int[]>() {
            @Override
            // Compare values according to columns
            public int compare(final int[] entry1,
                               final int[] entry2)
            {
 
                // To sort in descending order revert
                // the '>' Operator
                if (entry1[0] > entry2[0])
                    return 1;
                else
                    return -1;
            }
        });
        // System.out.println(Arrays.deepToString(points));
        int start=points[0][0];
        int end=points[0][1];
        int i=0;
        while(i<points.length){
            int currstart=points[i][0];
            int currend=points[i][1];
            if(start<=currstart && currstart<=end){
                i++;
                end = Math.min(end,currend);
            }else{
                ans++;
                start=currstart;
                end=currend;
                i++;
            }
        }
        ans++;
        return ans;
    }
}