class MyQueue {
    int []stk1;
    int [] stk2;
    int tos=-1;
    public MyQueue() {
        stk1=new int[101];
        stk2=new int[101];
    }
    
    public void push(int x) {
        tos++;
        stk1[tos]=x;
    }
    
    public int pop() {
        int temp = tos;
        int i=0;
        while(temp!=-1){
            stk2[i]=stk1[temp];
            temp--;
            i++;
        }
        int remove = stk1[0];
        tos--;
        temp = tos;
        i=0;
        while(temp!=-1){
            stk1[i]=stk2[temp];
            temp--;
            i++;
        }
        
        return remove;
    }
    
    public int peek() {
        int temp = tos;
        int i=0;
        while(temp!=-1){
            stk2[i]=stk1[temp];
            temp--;
            i++;
        }
        int peek = stk1[0];
        
        temp = tos;
        i=0;
        while(temp!=-1){
            stk1[i]=stk2[temp];
            temp--;
            i++;
        }
        
        return peek;
    }
    
    public boolean empty() {
        if(tos==-1){
            return true;
        }
        return false;
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