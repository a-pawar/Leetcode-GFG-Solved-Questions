class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long totalFlowerReq =(long) m*k;
        System.out.println(totalFlowerReq);
        long maxFlowerGet = bloomDay.length;
        System.out.print(maxFlowerGet);
        if(maxFlowerGet<totalFlowerReq){
            return -1;
        }
        //since answer is lies between min and max value in array find min and max value in array
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<min){
                min=bloomDay[i];
            }
            if(bloomDay[i]>max){
                max=bloomDay[i];
            }
        }
        int start=min,end=max;
        while(start<=end){
            int mid=(end-start)/2+start;
            int bouquetsGet = 0,temp=0;
            for(int i=0;i<bloomDay.length;i++){
                if(bloomDay[i]<=mid){
                    temp++;
                    if(temp==k){
                        bouquetsGet++;
                        temp=0;
                    }
                    
                }
                else{
                    temp=0;
                }    
            }
            if(m<=bouquetsGet){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return start; 
    }
}