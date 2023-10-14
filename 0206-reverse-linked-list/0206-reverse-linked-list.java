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
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        if(head==null){
            return head;
        }
        ListNode store=head.next;
        while(store!=null){
            head.next=prev;
            prev=head;
            head=store;
            store=store.next;
        } 
        head.next=prev;
        return head;   
    }
}