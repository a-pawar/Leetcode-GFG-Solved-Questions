/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp = head;
        HashMap<Node,Node> map = new HashMap<>();
        map.put(null,null);
        while(temp!=null){
            Node node = new Node(temp.val);
            map.put(temp,node);
            temp = temp.next;
        }
        temp = head;
        Node newHead=null;
        while(temp!=null){

            Node copy1 = map.get(temp);
            //store next node of temp
            Node nextNode = temp.next;
            Node copy2 = map.get(nextNode);

            copy1.next=copy2;

            //for random
            Node randomNode = temp.random;
            Node copy3 = map.get(randomNode);

            copy1.random = copy3;
            if(temp==head){
                newHead=copy1;
            } 
            temp = temp.next;
        } 
        return newHead;  
    }
}