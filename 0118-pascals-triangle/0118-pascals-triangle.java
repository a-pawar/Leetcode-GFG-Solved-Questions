class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> outerList = new ArrayList<>();
        List<Integer> innerList;

        for(int i=0;i<numRows;i++){
            innerList = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    innerList.add(1);
                }
                else{
                    innerList.add(outerList.get(i-1).get(j-1)+outerList.get(i-1).get(j));
                }
            }
            outerList.add(innerList);
        }
        return outerList;
    }
}