class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int [][] arr = new int[startTime.length][3];
        int [] dp = new int[50001];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        for(int i=0;i<startTime.length;i++){
            arr[i][0]=startTime[i];
            arr[i][1]=endTime[i];
            arr[i][2]=profit[i];
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            // Compare values according to columns
            public int compare(final int[] entry1,
                               final int[] entry2)
            {
                if (entry1[0] >= entry2[0])
                    return 1;
                else
                    return -1;
            }
        }); 
        for(int i=0;i<startTime.length;i++){
            
                System.out.print(arr[i][0]);
        }
        
        return maxProfit(arr,0,dp);
        
    }
    public int maxProfit(int [][] arr, int i,int []dp){
        //base case
        if(i>=arr.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int next=getNextIndex(arr,i+1,arr[i][1]);
        int taken = arr[i][2]+maxProfit(arr,next,dp);
        int notTaken = maxProfit(arr,i+1,dp);
        int ans =Math.max(taken,notTaken);
        dp[i]=ans;
        return ans;
        
    }
    public int getNextIndex(int[][] arr,int s,int currentend){
        int e=arr.length-1;
        int result=arr.length+1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid][0]>=currentend){
                result=mid;
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return result;
    }
}








