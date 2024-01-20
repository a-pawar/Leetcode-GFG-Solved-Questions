class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int [] NSL = getNSL(arr,n);
        int [] NSR = getNSR(arr,n);

        long sum =0;
        int m = 1000000007;
        for(int i=0;i<n;i++){
            long left = i-NSL[i];
            long right = NSR[i]-i;

            long totalWays = left*right;

            long totalSum = arr[i]*totalWays;
            sum = (sum+totalSum)%m;
        }
        return (int)sum;
    }
    public int[] getNSL(int [] arr, int n){
        Stack<Integer> stack = new Stack<>();
        int result []=new int [n];
        for(int i=0;i<n;i++){
            if(stack.isEmpty()){
                result[i]=-1;
            }else{
                while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                    stack.pop();
                }
                result[i] = stack.isEmpty() ? -1:stack.peek();
            }
            stack.push(i);
        }
        return result;
    }
     public int[] getNSR(int [] arr, int n){
        Stack<Integer> stack = new Stack<>();
        int result []=new int [n];
        for(int i=n-1;i>=0;i--){
            if(stack.isEmpty()){
                result[i]=n;
            }else{
                while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
                    stack.pop();
                }
                result[i] = stack.isEmpty() ? n:stack.peek();
            }
            stack.push(i);
        }
        return result;
    }
}