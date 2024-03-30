class Solution {
    public boolean isThree(int n) {
        int count=2;
        int i=2;
        while(n/2>=i){
            if(n%i==0){
                count++;
            }
            if(count>3){
                return false;
            }
            i++;
        }
        return count==3;
    }
}