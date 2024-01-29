class MyQueue {
    Stack<Integer> stk1;
    Stack<Integer> stk2;
    
    public MyQueue() {
        stk1=new Stack<>();
        stk2=new Stack<>();
    }
    
    public void push(int x) {
        
        stk1.push(x);
    }
    
    public int pop() {
        while(stk1.size()!=0){
            stk2.push(stk1.pop());
        }
        int remove = stk2.pop();
        while(stk2.size()!=0){
            stk1.push(stk2.pop());
        }
     
        
        return remove;
    }
    
    public int peek() {
        while(!stk1.isEmpty()){
            stk2.push(stk1.pop());
        }
        int peek = stk2.peek();
        while(!stk2.isEmpty()){
            stk1.push(stk2.pop());
        }
        return peek;
    }
    
    public boolean empty() {
        return stk1.isEmpty();
           
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */