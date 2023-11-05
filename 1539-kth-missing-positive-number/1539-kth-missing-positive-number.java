class Solution {
    public  int findKthPositive(int[] arr, int k) {
    //linear search    
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]<=k){
        //         k++;
        //     }
        //     else{
        //         break;
        //     }
        // }
        // return k;
    //binary search
        int s=0,e=arr.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            int missing=arr[mid]-(mid+1);
            if(missing<k){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return s+k;
    }
}