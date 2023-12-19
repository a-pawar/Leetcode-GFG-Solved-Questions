class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++){
            int temp =i;
            int countone=0;
            while(temp!=0){
                int rem = temp%2;
                if(rem==1){
                    countone++;
                }
                 temp = temp/2;
            }
             if( isPrime(countone)){
                count++;
            }
        }
        return count;
    }
    public static boolean isPrime(int num){
        if(num==1){
            return false;
        }
        if(num==2){
            return true;
        }
        int i=2;
        while(i<=num/2){
            if(num%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}