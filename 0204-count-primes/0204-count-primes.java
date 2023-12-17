class Solution {
    public int countPrimes(int n) {
        //strictly smaller
        if(n==0 || n==1 || n==2){
            return 0;
        }
        //sieve of eratosthenes algorithm
        boolean [] list =new boolean[n];
        int i=2;
        while(i<n){
            if(!list[i]){
                mark(list,i);
            }
            i++;
        }
        int count=0;
        for( i=2;i<n;i++){
            if(!list[i]){
                count++;
            }
        }

        return count;
    }
    public void mark(boolean [] list , int i){
        int temp=1;
        int j=i+i;
        while(j<list.length){
            list[j]=true;
            j=j+i;
        }
    }
}