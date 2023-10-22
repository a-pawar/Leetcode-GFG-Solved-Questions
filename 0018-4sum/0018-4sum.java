class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int i=0,j=0,k=0,l=0;
        long sum=0;
        int n=nums.length;
        List<List<Integer>> outerList = new ArrayList<>();
        while(i<n-3){
            if(i>0 && nums[i-1]==nums[i]){
                i++;
                continue;
            }
            
            j=i+1;
            while(j<n-2){
                if(j!=i+1 && nums[j-1]==nums[j]){
                    j++;
                    continue;
                }
                k=j+1;
                l=n-1;
                while(k<l){
                    sum = nums[i];
                    sum+=nums[j];
                    sum+=nums[k];
                    sum+=nums[l];
                    // System.out.print(sum);
                    if(sum>target){
                        l--;
                    }else if(sum<target){
                        k++;
                    }
                    else if(sum==target){
                        //sum is 0
                        List<Integer> innerList = new ArrayList<>(3);
                            innerList.add(nums[i]);
                            innerList.add(nums[j]);
                            innerList.add(nums[k]);
                            innerList.add(nums[l]);

                            outerList.add(innerList);
                            k++;
                            l--;
                            while(k<n && nums[k]==nums[k-1]){
                                k++;
                            }
                            while(l>0 && nums[l]==nums[l+1]){
                                l--;
                            }
                    }
                }
                j++;
                
            } 
            i++;        
        }
        return outerList;
    }
}