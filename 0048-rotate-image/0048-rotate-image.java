class Solution {
    public void rotate(int[][] matrix) {
        int r=matrix.length;
        int c=r;
        //take transpose of matrix 
        transpose(matrix,r,c);
        //swap first and last col then second and second last coloum
        for(int j=0;j<c/2;j++){
            for(int i=0;i<r;i++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[i][c-j-1];
                matrix[i][c-j-1]=temp;
            }
        }

    }
    public void transpose(int [][] matrix,int r,int c){
       
        for(int i=0;i<r;i++){
            for(int j=i+1;j<c;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
}