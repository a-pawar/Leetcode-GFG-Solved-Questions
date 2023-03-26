class Solution {
     public static void main(String [] args){
        int[] arr= {-20,-15,-2,7,7,7,7,8,9,12,37,45,90};
        int target = 7;
        int[] ans = searchRange(arr,target); 
        System.out.print(Arrays.toString(ans));
    }
    static int[] searchRange(int[] nums,int target){
        int[] ans={-1,-1};
        //check for first occurence
        ans[0] = search(nums,target,true);
        //check for last occurence
        ans[1] = search(nums,target,false);
                return ans;
    }
    static int search(int [] arr, int target,boolean isfirstcheck){
        int start = 0;
        int end = arr.length-1;
        int ans=-1;
        while(start<=end){
            //int mid = (start+end)/2  //when start and end have large value then error may occure
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                //potentiol ans found
                ans=mid;
                if(isfirstcheck){
                    end=mid-1;
                }
                else{
                    start = mid+1;
                }
                
            }
        }
        return ans;
    }
}