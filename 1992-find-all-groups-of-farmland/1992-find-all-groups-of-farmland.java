class Solution {
    public int[][] findFarmland(int[][] land) {
        List<int[]> list = new ArrayList<>();
        for(int i=0;i<land.length;i++){
            for(int j=0;j<land[0].length;j++){
                if(land[i][j] == 1){
                   int p2[] = new int[2];
                   visit(land,i,j,p2);
                   int grp[] = {i,j,p2[0],p2[1]};
                   list.add(grp);
                } 
            }
        }
        int arr[][] = new int[list.size()][];
        for(int i=0;i<list.size();i++){
              arr[i] = list.get(i);
        }
        return arr;
    }

    void visit(int land[][] , int i , int j, int p2[]){

        //base case
        if(i>=land.length || j>= land[0].length || 
           land[i][j] == 0){
              return;
           }

        //mark visited
        land[i][j] = 0;
        p2[0] = Math.max(p2[0],i);
        p2[1] = Math.max(p2[1],j);
        //visit right and down sides
        visit(land,i+1,j,p2);
        visit(land,i,j+1,p2);
    }
}