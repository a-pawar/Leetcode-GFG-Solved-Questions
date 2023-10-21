class Solution {
    //approach 1
//     public String frequencySort(String s) {
//         HashMap<Character,Integer> map = new HashMap<>();
//         for(int i=0;i<s.length();i++){
//             if(map.containsKey(s.charAt(i))){
//                 int count =map.get(s.charAt(i));
//                 map.put(s.charAt(i),count+1);
//             }
//             else{
//                 map.put(s.charAt(i),1);
//             }
//         }

//     ArrayList<Map.Entry<Character,Integer>> list = sortedRevArraylistByValue(map);
//     String ans ="";

//     //    Iterate over the ArrayList and add in string
//        for (int i=0 ; i<list.size();i++) {
//            Map.Entry<Character,Integer> mentry = list.get(i);
//            char ch =mentry.getKey();
//            int val = mentry.getValue();
//            for(int j=0;j<val;j++){
//             ans = ans+ch;
//         }
//        }
//         return ans;

//     }
//      private  ArrayList<Map.Entry<Character,Integer>> sortedRevArraylistByValue(HashMap<Character,Integer> hashmap) {
//        // Create an ArrayList and insert all hashmap key-value pairs.
//        ArrayList<Map.Entry<Character,Integer>> arrayList = new ArrayList<Map.Entry<Character,Integer>>();
//        for (Map.Entry<Character,Integer> entry : hashmap.entrySet()) {
//            arrayList.add(entry);
//        }
 
//        // Sort the Arraylist using a custom comparator.
//        Collections.sort(arrayList, new Comparator<Map.Entry<Character,Integer>>() {
//            @Override
//            public int compare(Map.Entry<Character,Integer> o1, Map.Entry<Character,Integer> o2) {
//                if ( o1.getValue() == o2.getValue() )
//                    return Character.compare((char)o1.getKey(),(char)o2.getKey());
 
//                return Integer.compare( (int)o2.getValue(),(int)o1.getValue() );
//            }
//        });
//         return arrayList;
      
    
//    }

    //approach 2
    public String frequencySort(String s) {
        char[] arr = new char[256];
    for(int i=0; i<s.length(); i++){
        arr[s.charAt(i)]++;    
    }
    
    StringBuilder sb = new StringBuilder();
    int max = -1;
    while(max != 0){
        max = -1;
        char maxi = 0;
        for(char i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                maxi = i;
            }
        }
        for(int i=0; i<max; i++){
            sb.append(maxi);   
        }
        arr[maxi] = 0;
    }
    return sb.toString();
        
    }

}