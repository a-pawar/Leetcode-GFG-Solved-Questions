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
    public ListNode doubleIt(ListNode head) {
        // Stack<Integer> stack = new Stack<>();
        
       ListNode revHead= reverseList(head);
        ListNode node=revHead;
        int carry=0;
        ListNode newHead=null;
        
        
        while(node!=null){
            int val = node.val;
            int mul = val*2+carry;
            carry=0;
            if(mul>9){
                carry=1;
                mul=mul%10;
            }
            ListNode newnode = new ListNode(mul);
            if(newHead==null){
                newHead=newnode;
            }else{
                newnode.next=newHead;
                newHead=newnode;
            }
            node=node.next;
        }
        if(carry==1){
            ListNode newnode = new ListNode(1);
            newnode.next=newHead;
            newHead=newnode;
        }
        return newHead;
    }
    public ListNode  reverseList(ListNode head){
        ListNode node = head;
        ListNode prev=null,nextnode=head.next;
        while(node!=null){
            node.next=prev;
            prev=node;
            node=nextnode;
            if(node!=null){
                nextnode=nextnode.next;
            }
        }
        return prev;
    }
}