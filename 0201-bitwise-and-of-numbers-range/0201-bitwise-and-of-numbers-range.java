class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int result=left;
        
        while(left<right){
            
            right=right&(right-1);
            result = right;
        }
        
        return result;   
    }
}
