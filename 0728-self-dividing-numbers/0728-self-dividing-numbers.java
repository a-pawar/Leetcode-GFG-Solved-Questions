class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list =new ArrayList<>();
        for(int i=left ; i<= right;i++){
            int n=i;
            boolean divide = true;
            boolean break1 = false;
            while(n>0){
                int rem= n%10;
                if(rem==0){
                    break1 =true;
                    break;
                }
                if(i%rem != 0){
                    divide = false;
                    break;
                }
                n = n/10;
            }
             if(break1){
                continue;
             }
            if(divide){
                list.add(i);
            }
        }
        return list;

    }
}