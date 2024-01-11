class MyHashMap {
    LinkedList<int []>[] arr ;
    int m=5000; // size of bucket
    public MyHashMap() {
        arr = new LinkedList[m];
        for(int i=0;i<m;i++){
            arr[i] = new LinkedList<>();
        }
    }
    public int hashing(int key){
        int index = key%m;
        return index;
    }
    
    public void put(int key, int value) {
        int index = hashing(key);
        LinkedList<int[]> list = arr[index];
        for(int i=0;i<list.size();i++){
            int [] pair = list.get(i);
            if(pair[0]==key){
                pair[1]=value;
                list.set(i,pair);
                return;
            }   
        }
        int [] pair = {key,value};
        list.add(pair);
    }
    
    public int get(int key) {
        int index = hashing(key);
        LinkedList<int[]> list = arr[index];
        for(int i=0;i<list.size();i++){
            int [] pair = list.get(i);
            if(pair[0]==key){
                return pair[1];
            }   
        }
        return -1;
    }
    
    public void remove(int key) {
        int index = hashing(key);
        LinkedList<int[]> list = arr[index];
        for(int i=0;i<list.size();i++){
            int [] pair = list.get(i);
            if(pair[0]==key){
                list.remove(i);
                break;
            }   
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */