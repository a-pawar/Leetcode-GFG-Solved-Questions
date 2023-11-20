class Solution {
    public double myPow(double x, int n) {
        double ans=1.0;
        boolean isNegative=false;
    //-2^31 not able to store in positive int
        long nn=n;
        if(nn<0){
            isNegative=true;
            nn=nn*(-1);
        }
        while(nn>0){
            if(nn%2==0){
                x=x*x;
                nn=nn/2;
            }
            else{
                ans=ans*x;
                nn=nn-1;
            }
        }
        if(isNegative){
            ans=1/ans;
        }
        return ans;
    }
}
//recursive 
// class Solution {
//     public double myPow(double x, int n) {
//         //store n is negative or not
//         boolean isNegative=false;
//         //-2^31 not able to store in positive int
//         long temp=n;
//         if(n<0){
//             isNegative=true;
//             temp=n*(-1);
//         }
//         double ans = myPowHelper(x,temp);
//         if(isNegative){
//             ans=1/ans;
//         }
//         return ans;
//     }
//     public double myPowHelper(double x,long n){
//         if(n==0){
//             return 1;
//         }
//         //if n is positive 
//         if(n%2==0){
//             return myPowHelper(x*x,n/2);
//         }
//         // if(n%2==1){
//             return myPowHelper(x,n-1)*x;
//         // }
       
        
//     }
// }