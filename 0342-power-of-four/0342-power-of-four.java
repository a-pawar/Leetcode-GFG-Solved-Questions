class Solution {
    public boolean isPowerOfFour(int n) {
      if(n%10==4 || n%10==6 || n==1){
          double temp = n;
          while(temp>=1.0){
              if(temp==1.0){
                  return true;
              }
            temp = temp/4;
          }
      }  
      return false;
    }
}