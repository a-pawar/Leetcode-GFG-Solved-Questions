class StockSpanner {
    Stack<Integer> stack;
    ArrayList<Integer> list;
    int i;
    public StockSpanner() {
        stack = new Stack<Integer>();
        list = new ArrayList<>();
        i=0;
    }
    
    public int next(int price) {
        if(stack.isEmpty()){
            list.add(price);
            stack.push(i++);
            return 1;
        }else{
            int top = list.get(stack.peek());
            if(top<=price){
                while(!stack.isEmpty() && list.get(stack.peek())<=price){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    stack.push(i++);
                    list.add(price);
                    return i;
                }else{
                    int span = i-stack.peek();
                    stack.push(i++);
                    list.add(price);
                    return span;
                }
               
            }else{
                 stack.push(i++);
                list.add(price);
                return 1;
            }
        }
       
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */