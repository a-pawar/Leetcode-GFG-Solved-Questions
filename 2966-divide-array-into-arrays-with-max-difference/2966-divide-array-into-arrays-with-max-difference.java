class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int ansIndex [] = new int[nums.length];
        for(int i=0;i<ansIndex.length;i++){
            ansIndex[i]=-1;
        }
        int temp=0;
        boolean notPossible=false;
        
        for(int i=0;i<nums.length-2;i++){
            int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
            int start=i,end=i+2;
           for(int j=start;j<=end;j++){
               
               if(nums[j]<min){
                   min=nums[j];
               }
               if(nums[j]>max){
                   max=nums[j];
               }
               
           } 
            if(max-min<=k){
                   ansIndex[temp++]=i;
                   ansIndex[temp++]=i+2;
                   i=i+2;
                    
               }
        }
        int a = nums.length/3;
        System.out.print(a+" "+temp);
        if(ansIndex[a*2-1]==-1){
            int[][] emptyans = {};
            return emptyans;
        }
        int ans[][] = new int[temp/2][];
        int count=0;
        for(int i=0;i<temp;i=i+2){
            int ar[] = new int[3];
            int s = ansIndex[i];
            ar[0]=nums[s];
            ar[1]=nums[s+1];
            ar[2]=nums[s+2];
            ans[count++]=ar;
        }
        return ans;
    }
}