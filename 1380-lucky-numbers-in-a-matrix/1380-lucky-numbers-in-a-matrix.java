class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();        
        for(int i=0;i<matrix.length;i++){
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            int temp=0;
            for(int j =0;j<matrix[i].length;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                     temp=j;
                }
            }
            for(int k=0;k<matrix.length;k++){
                if(matrix[k][temp]>max){
                    max=matrix[k][temp];
                }
            }
            if(min==max){
                list.add(min);
            }
        }
        return list;
    }
}