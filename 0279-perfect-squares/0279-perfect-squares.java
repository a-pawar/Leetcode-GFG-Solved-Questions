class Solution {
    public int numSquares(int n) {
        int [] arr = new int[n+1];
        for(int i=0;i<arr.length;i++){
            arr[i]=-1;
        }
        return numSquaresHelper(n,arr);
    }
    public int numSquaresHelper(int n,int [] arr) {
        if(n<=0){
            return 0;
        }
        if(arr[n]!=-1){
            return arr[n];
        }
        int min=Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++){
            int smallAns =1+numSquaresHelper(n-i*i,arr);
            min =  Math.min(smallAns,min);
        }
        arr[n]=min;
        return min;
    }
}