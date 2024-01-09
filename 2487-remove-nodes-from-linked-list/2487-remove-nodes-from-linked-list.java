/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        ListNode node =head;
        Stack<Integer> stack = new Stack<>();
        while(node!=null){
            stack.push(node.val);
            node = node.next;
        }
        ListNode newHead=null;
        int max=Integer.MIN_VALUE;
        while(stack.size()!=0){
            int top = stack.pop();
            if(top>=max){
                max=top;
                ListNode newnode = new ListNode(top);
                if(newHead==null){
                    newHead=newnode;
                }else{
                    newnode.next = newHead;
                    newHead=newnode;
                }
            }
            
        }
        return newHead;
        
    }
}