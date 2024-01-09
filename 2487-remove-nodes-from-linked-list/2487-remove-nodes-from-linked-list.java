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
        ListNode revHead = reverseList(head);
        ListNode node = revHead.next,temp=revHead;
        int max=revHead.val;
        //first in rev (last) node is always included
        while(node!=null){
            if(node.val>=max){
                max=node.val;
                temp.next=node;
                temp = node;
            }
            node=node.next;
        }
        temp.next=null;
        ListNode newHead = reverseList(revHead);
        return newHead;
        
    }
    public ListNode reverseList(ListNode head){
        ListNode node = head,prev=null,nextnode=head.next;
        while(node!=null){
            node.next = prev;
            prev=node;
            node = nextnode;
            if(nextnode!=null){
                nextnode = nextnode.next;
            }
            
        }
        return prev;
        
    }
}