class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n= s.length();
        int [] arr = new int[26];
        for(int i=0;i<p.length();i++){
            arr[p.charAt(i)-'a']++;
        }
        List<Integer> list = new ArrayList<>();
        //sliding window
        int l=0,r=0;
        int k=p.length();
        while(r<n){
            arr[s.charAt(r)-'a']--;
            if(k==r-l+1){
                if(isAnagram(arr)){
                    list.add(l);
                }
                arr[s.charAt(l)-'a']++;
                l++;
            }

            r++;
        }
        return list;

    }
    public boolean isAnagram(int [] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
}