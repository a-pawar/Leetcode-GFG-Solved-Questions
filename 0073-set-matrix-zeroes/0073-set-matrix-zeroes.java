class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList <Integer> list = new ArrayList<Integer>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    list.add(i);
                    list.add(j);
                }
            }
        }
        for(int i=0;i<list.size();i=i+2){
            int x=list.get(i);
            int y=list.get(i+1);
            for(int x1=0;x1<matrix[x].length;x1++){
                matrix[x][x1]=0;
            }
            for(int y1=0;y1<matrix.length;y1++){
                matrix[y1][y]=0;
            }
        }
        
    }
}