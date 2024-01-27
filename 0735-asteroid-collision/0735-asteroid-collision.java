class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            //asteroids collide only when there is pos on top and ith elem is neg
                while(!stack.isEmpty()  && stack.peek()>0 && asteroids[i]<0){
                    int top = stack.peek();
                    int sum = top+asteroids[i];
                    if(sum<0){
                        stack.pop();
                    } else if(sum>0){
                        asteroids[i]=0;
                    }  else{
                        stack.pop();
                        asteroids[i]=0;
                    } 
                }
                if(asteroids[i]!=0){
                    stack.push(asteroids[i]);
                }
        }
        int n = stack.size();
        int [] ans = new int[n];
        
        while(!stack.isEmpty()){
            ans[--n]=stack.pop();
            
        }
        return ans;
    }
}