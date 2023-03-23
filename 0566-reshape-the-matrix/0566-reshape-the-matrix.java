class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int promat = mat.length * mat[0].length; 
        int a = r * c;

        if(promat != a ){
            return mat;
        }
        int [] arr = new int[a];
        int x=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                arr[x++]=mat[i][j];
            }
        }
        x=0;
        int [][] newmatrix = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                newmatrix[i][j] = arr[x++];
            }
        }

        return newmatrix;
    }
}