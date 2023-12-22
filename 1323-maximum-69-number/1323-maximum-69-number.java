class Solution {
    public int maximum69Number (int num) {
        int i=0;
        int temp=num;
        //store highest positon of 6
        int store=-1;
        while(temp>0){
            if(temp%10==6){
                store=i;
            }
            temp/=10;
            i++;
        }
        if(store==-1){
            return num;
        }
        System.out.print(store);
        int ans =(int) Math.pow(10,store)*3+num;
        return ans;
    }
}