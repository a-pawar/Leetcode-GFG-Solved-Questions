class Solution {
    public int[] twoSum(int[] nums, int target) {
//approach 3 - best approach
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans[]=new int[]{-1,-1};
        map.put(nums[0],0);
        for(int i=1;i<nums.length;i++){
            int find = target - nums[i];
            if(map.containsKey(find)){
                ans[0] = map.get(find);
                ans[1] = i;
                return ans;
            }
            
                map.put(nums[i],i);
            
        }
        return ans;
//approach 1
        // int arr[]=new int[]{-1,-1};
        // for(int i=0;i < nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if((nums[i]+nums[j])==target){
        //         arr[0]=i;
        //         arr[1]=j; 
        //         return arr;
        //         }
        //     }
        // }
        // return arr;
//approach 2
//         int [] arr=nums;
//         int ans[]=new int[]{-1,-1};
//         ArrayList<ArrayList<Integer>> outerList = new ArrayList<>();
// 		for(int i=0;i<arr.length;i++){
// 		    ArrayList<Integer> innerList = new ArrayList<>();
// 		    innerList.add(arr[i]);
// 		    innerList.add(i);
// 		    outerList.add(innerList);
// 		}
// // 		ArrayList<ArrayList<Integer>> list;
//         Collections.sort(outerList, new Comparator<ArrayList<Integer>> () {
//             @Override
//             public int compare(ArrayList<Integer> a, ArrayList<Integer> b) {
//                 return a.get(0).compareTo(b.get(0));
//             }
//         });
//         // System.out.print(outerList.get(0).get(0));
//         int s=0;
//         int e=outerList.size()-1;
//         while(s<e){
//             int sum = outerList.get(s).get(0)+outerList.get(e).get(0);
            
//             if(sum==target){
//                 int a =outerList.get(s).get(1);
//                 int b = outerList.get(e).get(1);
//                 if(a<b){
//                     ans[0] = a;
//                     ans[1] = b;
//                 }
//                 else{
//                     ans[0] = b;
//                     ans[1] = a;
//                 }
//                 break;
//             }else if(sum<target){
//                 s++;
//             }
//             else{
//                 e--;
//             }
//         }
//         return ans; 
    }
}