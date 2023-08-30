import java.util.*;
class Solution {
//approach 2 - two pointer
    public List<List<Integer>> threeSum(int[] nums) {
       Arrays.sort(nums);
       int i=0,j=0,k=0,sum=0;
       int n = nums.length;
       List<List<Integer>> outerList = new ArrayList<>();
       while(i<n-2){
           if(i>0 && nums[i-1]==nums[i]){
               i++;
               continue;
           }
           j=i+1;
           k=n-1;
           while(j<k){
               sum = nums[i]+nums[j]+nums[k];
               if(sum>0){
                   k--;
               }else if(sum<0){
                   j++;
               }
               else{
                   //sum is 0
                   List<Integer> innerList = new ArrayList<>(3);
                    innerList.add(nums[i]);
                    innerList.add(nums[j]);
                    innerList.add(nums[k]);

                    outerList.add(innerList);
                    j++;
                    k--;
                    while(j<n && nums[j]==nums[j-1]){
                        j++;
                    }
                    while(k>0 && nums[k]==nums[k+1]){
                        k--;
                    }
               }
           }
           i++;
       }
        return outerList;
    }
//approach 1
    // public List<List<Integer>> threeSum(int[] nums) {
       
    //     Set<List<Integer>> hSet = new HashSet<>();
    //     Arrays.sort(nums);
        
    //     for(int i=0;i<nums.length;i++){
    //         int target = 0 - nums[i];
    //         if(i>0 && nums[i]==nums[i-1]){
    //             continue;
    //         }
    //         List<Integer> indexList = pairSum(nums,i+1,nums.length-1,target);        
    //         while(!indexList.isEmpty()){

    //             List<Integer> innerList = new ArrayList<>();
    //             innerList.add(nums[i]);
    //             innerList.add(nums[indexList.remove(0)]);
    //             innerList.add(nums[indexList.remove(0)]);
    //              Collections.sort(innerList);
    //             // outerList.add(innerList);
    //             hSet.add(innerList);
                
    //         }
            
    //     } 
    //     List<List<Integer>> outerList = new ArrayList<>(hSet);
    //     return outerList;
    // }
    // public List<Integer> pairSum(int [] nums,int start,int end,int target){
    //     List<Integer> list = new ArrayList<>();
        
    //     while(start<end ){
    //         if(nums[start]+nums[end]==target){
    //             list.add(start);
    //             list.add(end);
    //         }
            
    //         if(nums[start]==nums[end]){
    //             return list;
    //         }
    //         if(nums[start]+nums[end]<target){
    //             start++;
    //         }
    //         else{

    //             end--;
    //         }
    //     }
    //     return list;
    // }
}