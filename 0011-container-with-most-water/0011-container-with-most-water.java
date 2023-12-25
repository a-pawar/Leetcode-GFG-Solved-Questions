class Solution {
    public int maxArea(int[] height) {
        int ans=0;
        // for(int i=0;i<height.length-1;i++){
        //     for(int j=i+1;j<height.length;j++){
        //         int yaxis =Math.min(height[i],height[j]);
        //         int xaxis = j-i;
        //         int temp=xaxis*yaxis;
        //         if(ans<temp){
        //             ans = xaxis*yaxis;
        //         }

        //     }
        // }
        int start=0,end=height.length-1,xaxis=0,yaxis=0;
        while(start<end){
            xaxis = end-start;
            if(height[start]<height[end]){
                yaxis = height[start];
                start++;
            }else{
                yaxis = height[end];
                end--;
            }
            int temp = xaxis*yaxis;

            if(ans<temp){
                ans=temp;
            }

        }
        
        return ans;
    }
}