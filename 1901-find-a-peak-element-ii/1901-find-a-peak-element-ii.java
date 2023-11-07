class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m=mat.length,n=mat[0].length;
        int ans[]=new int[2];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                boolean check=findMax(mat,i,j);
                if(check){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }         
            }
        }
        ans[0]=-1;
        ans[1]=-1;
        return ans;
    }
    public boolean findMax(int [][] mat,int r,int c){
      
        int m=mat.length,n=mat[0].length;
        boolean check=true;
        //check right side
        if(c+1<n && mat[r][c]<mat[r][c+1]){
            check=false;
        }
        //check top side
        if(check && r>0 && mat[r-1][c]>mat[r][c]){
            check=false;
        }
        //check left side
        if(check && c>0 && mat[r][c-1]>mat[r][c]){
            check=false;
        }
        //check bottom side
        if(check && r+1<m && mat[r][c]<mat[r+1][c]){
            check=false;
        }
        return check;


    }
}