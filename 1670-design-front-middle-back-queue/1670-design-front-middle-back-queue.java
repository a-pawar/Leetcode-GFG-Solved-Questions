class FrontMiddleBackQueue {
    LinkedList<Integer> list ;

    public FrontMiddleBackQueue() {
        list =new LinkedList<Integer>();
    }
    
    public void pushFront(int val) {
        list.addFirst(val);
    }
    
    public void pushMiddle(int val) {
        int size = list.size();
        
        int mid = size/2;
        list.add(mid,val);
        
    }
    
    public void pushBack(int val) {
        list.addLast(val);
    }
    
    public int popFront() {
        if(list.isEmpty()){
            return -1;
        }
       return list.pollFirst();
    }
    
    public int popMiddle() {
        if(list.isEmpty()){
            return -1;
        }
        int size = list.size();
        int mid=0;
        if(size%2==0){
             mid = size/2-1;
        }else{
            mid=size/2;
        }
        
        return list.remove(mid);   
    }
    
    public int popBack() {
        if(list.isEmpty()){
            return -1;
        }
        return list.pollLast();
        
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */