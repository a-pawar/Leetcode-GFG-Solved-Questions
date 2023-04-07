class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<Integer> ();
        for(int a:nums1){
            s1.add(a);
        }
        Set<Integer> s2 = new HashSet<Integer> ();
        for(int b:nums2){
            if(s1.contains(b)){
                s2.add(b);
            }
        }

        
        int [] arr = new int[s2.size()];
        int i=0;
        for(int c:s2){
            arr[i++]=c;
        }
        return arr;
    }
}