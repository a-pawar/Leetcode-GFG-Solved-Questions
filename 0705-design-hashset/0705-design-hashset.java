class MyHashSet {
    LinkedList<Integer> [] arr;
    int m = 5000;//size of bucket
    public int hashing(int key){
        int index = key%m;
        return index;
    }
    public MyHashSet() {
        arr = new LinkedList[5000];
        for(int i=0;i<arr.length;i++){
            arr[i]=new LinkedList<>();
        }
    }

    
    public void add(int key) {
        int index = hashing(key);
        LinkedList<Integer> list = arr[index];
        boolean iscontain = contains(key);
        if(!iscontain){
            list.add(key);
        }
        
    }
    
    public void remove(int key) {
        int index = hashing(key);
        LinkedList<Integer> list = arr[index];
        int keyindex = list.indexOf(key);
        if(keyindex!=-1){
            list.remove(keyindex);
        }
        
    }
    
    public boolean contains(int key) {
        int index = hashing(key);
        LinkedList<Integer> list = arr[index];
        if(list.size()==0){
            return false;
        }
        return list.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */