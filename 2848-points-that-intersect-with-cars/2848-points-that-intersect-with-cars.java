class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int [] arr = new int[101];
        int start =0,end=0;
        for(int i=0;i<nums.size();i++){
            start = nums.get(i).get(0);
            end = nums.get(i).get(1);
            for(int j=start;j<=end;j++){
                arr[j]=1;
            }
        }
        int count=0;
        // System.out.print(arr[0]);
        for(int k=1;k<=100;k++){
            
            if(arr[k]==1){
                count++;
            }
        }
        return count;
    }
}