class Solution {
    public int[] getAverages(int[] nums, int k) {
        if(k==0 ){
            return nums;
        }
        int n=nums.length;
        int [] ans = new int [n];
        for(int j=0;j<n;j++){
            ans[j]=-1;
        }
        if(n<2*k+1){
            return ans;
        }
        
        int l=0,r=2*k,i=k;
        long windowsum=0,avg=0;
        
        for(int j=l;j<=r;j++){
            windowsum += nums[j];
        }
        int count=k*2+1;
        avg = windowsum/count;
        ans[i]=(int)avg;
        i++;
        r++;
        while(r<n){
            int newel = nums[r];
            int gone = nums[l];
            windowsum = windowsum+newel-gone;
            avg = windowsum/count;
            ans[i]=(int)avg;
            i++; 
            l++;
            r++;
        }
        return ans;
    }
}