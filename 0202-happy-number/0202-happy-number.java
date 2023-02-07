class Solution {
    public boolean isHappy(int n) {
        while(true){
            int temp=n;
            int sum=0;
            while(temp>0){
                int rem = temp%10;
                sum = sum + rem*rem;
                temp /=10;
            }
            n=sum;
            if(sum==1){
                return true;
            }
            if(sum!=7 &&sum<=9){
                return false;
            }
        }
    }
}