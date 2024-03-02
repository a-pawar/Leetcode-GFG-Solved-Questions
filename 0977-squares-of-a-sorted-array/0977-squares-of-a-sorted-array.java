class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int index=0;
        int neg=0,pos=0;
        if(n==1){
            nums[0]=nums[0]*nums[0];
            return nums;
        }
        for(int i=1;i<n;i++){
            if(nums[i-1]<0 && 0<=nums[i]){
                neg=i-1;
                pos=i;
                break;
            }
        }
        if(neg==pos){
            if(nums[0]<0){
                neg=n-1;
                pos=n;
            }else{
                pos=0;
                neg=-1;
            }
        }
        while(0<=neg && pos<n){
            int negsq=nums[neg]*nums[neg];
            int possq=nums[pos]*nums[pos];
            if(negsq<possq){
                ans[index++]=negsq;
                neg--;
            }else{
                ans[index++]=possq;
                pos++;
            }
        }
        while(0<=neg){
            int negsq=nums[neg]*nums[neg];
                ans[index++]=negsq;
                neg--;
        }
        while(pos<n){
            int possq=nums[pos]*nums[pos];
                ans[index++]=possq;
                pos++;
            
        }
        return ans;
    }
}