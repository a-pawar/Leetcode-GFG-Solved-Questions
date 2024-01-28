class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int m=matrix.length;
        int n = matrix[0].length;

        //first take row wise cumulative sum
        for(int row=0;row<m;row++){
            for(int col=1;col<n;col++){
                matrix[row][col]+=matrix[row][col-1];
            }
        }
        int res=0;
        //need to find the no. of subarray with sum==target-downward direction
        for(int startCol=0;startCol<n;startCol++){
            for(int j=startCol; j<n;j++){
                HashMap<Integer,Integer> map = new HashMap<>();
                int prefixSum=0, findVal=0;
                map.put(prefixSum,1);
                for(int row =0;row<m;row++){
                    if(startCol>0){
                        prefixSum+=matrix[row][j]-matrix[row][startCol-1];
                    }else{
                        prefixSum+=matrix[row][j];
                    }

                     findVal = prefixSum-target;
                    if(map.containsKey(findVal)){
                        res = res + map.get(findVal);
                    }

                    if(map.containsKey(prefixSum)){
                        map.put(prefixSum,map.get(prefixSum)+1);
                    }else{
                        map.put(prefixSum,1);
                    }
                    
                }
            }
        }
        return res;
    }
}