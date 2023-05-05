class Solution {
    public int fib(int n) {
        int fibarr[] = new int[n+1];
        if(n<=1){
            return n;
        }
        fibarr[0]=0;
        fibarr[1]=1;
        
        for(int i=2;i<=n;i++){
            fibarr[i]=fibarr[i-1]+fibarr[i-2];
        }
        return fibarr[n];
    }
}