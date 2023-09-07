class Solution {
    public void sortColors(int[] arr) {
        int zeros =0;
        int twos=arr.length-1;
        int i=0;
        while(i<=twos){
            if(arr[i]==1){
                i++;
            }
            else if(arr[i]==0){
                if(arr[i]==arr[zeros]){
                    i++;
                    zeros++;
                }else{
                    int temp = arr[zeros];
                    arr[zeros] = arr[i];
                    arr[i]=temp;
                    zeros++;
                }
            }
            else{
               int temp = arr[twos];
                arr[twos] = arr[i];
                arr[i]=temp; 
                twos--;
            }
        }
    }
}