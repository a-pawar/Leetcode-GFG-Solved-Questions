
import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        int r=intervals.length,c=intervals[0].length;
      Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
      int [] arr = new int[r*c];
      arr[0]=intervals[0][0];
      arr[1]=intervals[0][1];
      int lastIndex=1;
      int i=1;
      
      while(i<r){
        int j=0;
            if(arr[lastIndex]>=intervals[i][j]){
                j++;
                arr[lastIndex]=Math.max(intervals[i][j],arr[lastIndex]);
            }else{
                lastIndex++;
                arr[lastIndex]=intervals[i][j];
                j++;
                lastIndex++;
                arr[lastIndex]=intervals[i][j];
            }
        i++;
         
      }
      int ans [][]=new int[lastIndex/2+1][c];
      i=0;
      for(int k=0;k<lastIndex;k=k+2){
          ans[i][0]=arr[k];
          ans[i][1]=arr[k+1];
          i++;

      }
      return ans;
    }
}