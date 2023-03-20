class Solution {
    public int maximumPopulation(int[][] logs) {
        int ans=1950;
       
        int max=0;
        for(int year=1950;year<=2050;year++){ 
            int pop=0;   
            for(int i=0;i<logs.length;i++){
                int j=0;
                
                if(logs[i][j]<=year && logs[i][j+1]>year){    
                    pop++;    
                }
                if(max < pop){
                    max=pop;
                    ans=year;
                }   
            }

            
        }
        return ans;
    }
}