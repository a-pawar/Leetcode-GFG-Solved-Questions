class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        int m=grid.length,n=grid[0].length;
        int r=m-1,c=0;
        while(r>=0 && c<n){
            if(grid[r][c]<0){
                --r;
                count = count + (n-c);
            }
            else{
                ++c;
            }
        }
        return count;
    }
}