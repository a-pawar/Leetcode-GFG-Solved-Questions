class Solution {
    public  int findKthPositive(int[] arr, int k) {
        //int condition = arr[arr.length-1]+k;
        ArrayList<Integer> list = new ArrayList<Integer> ();
        int j=0;
        for(int i=1;i<arr[arr.length-1];i++){
            if(j<arr.length-1 && arr[j]==i){
               j++;
            }
            else{
                list.add(i);
            }
        }
        for(int i=arr[arr.length-1]+1;i<=arr[arr.length-1]+k;i++){
            
                list.add(i);
            
        }
        
       // System.out.println(list.get(0));
        return list.get(k-1);
    }
}