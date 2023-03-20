class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        
        if( check(mat,target)){
            return true;
        }
        rotate(mat);
        if( check(mat,target)){
            return true;
        }
        rotate(mat);
        if( check(mat,target)){
            return true;
        }
        rotate(mat);
        if( check(mat,target)){
            return true;
        }
        return false;
        
    }
    public  void rotate(int [][]mat) {
        int n = mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] =temp;
            }
        }
        for(int j=0;j<n/2;j++){
            for(int i=0;i<n;i++){
                int temp = mat[i][j];
                mat[i][j] = mat[i][n-j-1];
                mat[i][n-j-1] = temp;
            }
        }
        
    }
    public  boolean check(int [][] mat, int [][] tar){
        int n = mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] != tar[i][j]){
                    return false;
                }
            }
        } 
        return true;
    }
}