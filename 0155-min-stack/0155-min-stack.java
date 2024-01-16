class MinStack {
    Stack<Long> stack;
    Long min = Long.MAX_VALUE;
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int value) {
        Long val = Long.valueOf(value);
        if(stack.isEmpty()){
            stack.push(val);
            min=val;
        }else{
            if(val<min){
                
                stack.push(2*val-min);
                min=val;
            }else{
                stack.push(val);
            }
        }
    }
    
    public void pop() {
        //min has to change
        if(stack.peek()<min){
            //generate previous
            long a = 1;
            min = 2*min*a-stack.peek();
        }
        stack.pop();
    }
    
    public int top() {
        //means top of stack contains modified value
        if(stack.peek()<min){
            return min.intValue();
        }
        Long temp =  stack.peek();
        return temp.intValue();
    }
    
    public int getMin() {
        return min.intValue();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */