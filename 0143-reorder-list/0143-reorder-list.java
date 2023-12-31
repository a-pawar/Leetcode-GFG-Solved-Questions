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
    public void reorderList(ListNode head) {
        ListNode mid=getMid(head);
        ListNode secondHead=mid.next;
        mid.next=null;
        //reverse second half
        ListNode reverseSecondHead=reverseLL(secondHead);
        ListNode node = head;
        while(node!=null && node.next!=null &&reverseSecondHead!=null){
            ListNode store=node.next;
            node.next=reverseSecondHead;
            reverseSecondHead=reverseSecondHead.next;
            node=node.next;
            node.next=store;
            node=node.next;
        }
       
        
    }
    public ListNode reverseLL(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev=null,curr=head,nextnode=head.next;
        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=nextnode ;
            if(nextnode!=null){
                nextnode = nextnode.next;
            }   
        }
        return prev;
    }
    public ListNode getMid(ListNode head){
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}