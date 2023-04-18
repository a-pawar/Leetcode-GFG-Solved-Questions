class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int rStart = 0;
        int rEnd = row-1;
        int cMid = col/2;

         if(row==1){
            return binarySearch(matrix, target, 0, 0, col-1);
        }
        while(rStart < rEnd-1){
            int rMid = rStart + (rEnd-rStart)/2;
            if(matrix[rMid][cMid] == target){
                return true;
            }
            else if(matrix[rMid][cMid] < target){
                rStart = rMid;
            }
            else {
                 rEnd = rMid;
            }
        }
        if(matrix[rStart][cMid]==target){
            return true;
        }
        if(matrix[rStart+1][cMid]==target){
            return true;
        }
        if(cMid>0 &&  matrix[rStart][cMid-1]>=target){
            return binarySearch(matrix,target,rStart,0,cMid-1);
        }
        else if(cMid<col-1 && matrix[rStart][cMid+1]<=target && matrix[rStart][col-1]>=target){
            return binarySearch(matrix,target,rStart,cMid+1,col-1);
        }
        else if(cMid>0 && matrix[rStart+1][cMid-1]>=target){
            return binarySearch(matrix,target,rStart+1,0,cMid-1);
        }
        else {
            return binarySearch(matrix,target,rStart+1,cMid+1,col-1);
        }
    }
    public static boolean binarySearch(int [][] matrix,int target,int r,int c1,int c2)  {           
        int start = c1 ;
        int end = c2;

            while(start<=end){
                int cMid = start + (end-start)/2;
                if(matrix[r][cMid]==target){
                    return true;
                }
                else if(matrix[r][cMid]<target){
                    start=cMid+1;
                }
                else{
                    end = cMid-1;
                }
            }
            return false;
    }
}