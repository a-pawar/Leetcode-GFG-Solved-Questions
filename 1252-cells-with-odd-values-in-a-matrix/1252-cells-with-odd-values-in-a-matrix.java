class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] newarr = new int[m][n];
        for(int i=0;i<indices.length;i++){
            int j=0;
                
                    int x = indices[i][j];
                    for(int y=0;y<newarr[x].length;y++){
                        newarr[x][y] = newarr[x][y] +1;
                    }
            
        }
        for(int i=0;i<indices.length;i++){
            int j=1;
                    int y = indices[i][j];
                    for(int x=0;x<newarr.length;x++){
                        newarr[x][y] = newarr[x][y] +1;
                    }
        }
        int count =0;
        for(int i=0 ; i<newarr.length;i++){
            for(int j=0;j<newarr[i].length;j++){
                if(newarr[i][j]%2 != 0){
                    count++;
                }
            }
        }
        return count;
    }
}