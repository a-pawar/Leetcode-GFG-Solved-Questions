class MyCircularQueue {
    int arr[];
    int front,rear;
    public MyCircularQueue(int k) {
        arr = new int[k];
        front=-1;
        rear=-1;
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        if(front==-1){
            front++;
        }
        rear++;
        rear=rear%arr.length;
        arr[rear]=value;
        return true;
        
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        if(front==rear){
            front=-1;
            rear=-1;
        }else{
            front++;
            front=front%arr.length;
        }
        
        return true;
        
    }
    
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return arr[front];
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return arr[rear];
    }
    
    public boolean isEmpty() {
        if(front==-1 && front==rear){
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        int temp =(rear+1)%arr.length;
        if(front==temp){
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */