class Solution {
    public int pivotInteger(int n) {
        if(n==1){
            return 1;
        }
        int totalSum = n*(n+1)/2;
        int l=1,h=n;

        while(l<h){
            int mid = (l+h)/2;
            //before 1 to x-----after x to n
            int before = mid*(mid+1)/2;
            int after = totalSum-before+mid;

            if(before == after){
                return mid;
            }
            else if(before<after){
                l = mid+1;
            }else{
                h=mid-1;
            }
        }
        return -1;


    }
}