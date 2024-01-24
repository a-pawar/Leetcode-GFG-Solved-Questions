class ProductOfNumbers {
    ArrayList<Integer> list;
    int prev;

    public ProductOfNumbers() {
        list = new ArrayList<Integer>();
        prev=1;
    }
    
    public void add(int num) {
        if(num==0){
            prev=1;
            list.clear();
        }else{
            list.add(prev);
            prev = prev * num;  
        }
    }
    
    public int getProduct(int k) {
        int N = list.size();
        //there any 0 occurs 
        if(k>N){
            return 0;
        }else{
            return prev/list.get(N-k);
        }
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */