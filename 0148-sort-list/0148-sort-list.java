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
    public ListNode sortList(ListNode head) {
        //using merge sort
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        
        return merge(left,right);
        
    }
    private ListNode merge(ListNode left , ListNode right){
        //merge two sorted list
        ListNode newHead;
        if(left.val < right.val){
            newHead=left;
            left=left.next;
        }else{
            newHead=right;
            right=right.next;
        }
        ListNode temp = newHead;
        while(left!=null && right!=null){
            if(left.val < right.val){
                temp.next = left;
                temp = temp.next;
                left=left.next;
            }else{
                temp.next = right;
                temp = temp.next;
                right=right.next;
            }
        }
        if(left!=null){
            temp.next=left;
        }
        if(right!=null){
            temp.next = right;
        }
        return newHead;
    }
    private ListNode getMid(ListNode head){
        ListNode slow=head;
        ListNode fast = head;
        ListNode prev=head;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow = slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        return slow;
    }
    
}