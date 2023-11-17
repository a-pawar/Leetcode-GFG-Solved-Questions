/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
      //determine using slow and fast pointer
      if(head==null || head.next==null){
          return false;
      } 
      ListNode slow=head;
      ListNode fast=head;
      while(fast.next!=null && fast.next.next!=null){
          slow=slow.next;
          fast=fast.next.next;
          //is slow and fast becomes equal there is a cycle
            if(slow==fast){
                return true;
            }
      } 
      return false;
    }
}