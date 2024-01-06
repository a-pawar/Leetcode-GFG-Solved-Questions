 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class MyHashSet {
    ListNode head;
    ListNode tail;

    public MyHashSet() {
        
    }
    
    public void add(int key) {
        ListNode newnode = new ListNode(key);
        if(!contains(key)){
            if(head==null){
                head=newnode;
                tail=newnode;
            }else{
                tail.next=newnode;
                tail=newnode;
            }
        }
    }
    
    public void remove(int key) {
        ListNode node =head,prev=null;
        while(node!=null){
            if(node.val==key){
                if(head==node){
                    head=head.next;
                    //only one node in list
                    if(head==tail){
                        tail=head;
                    }
                }else{
                    prev.next=node.next;
                    if(tail==node){
                        tail=prev;
                    }
                }
                break;
            }
            prev=node;
            node=node.next;   
        }
        
    }
    
    public boolean contains(int key) {
        ListNode node = head;
        
        while(node!=null){
            if(node.val==key){
                
                return true;
            }
            node=node.next;
        }
        return false;
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */