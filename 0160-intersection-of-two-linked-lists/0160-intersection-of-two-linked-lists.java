/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;
        }
        ListNode tempA=headA,tempB=headB;
        //we are looping for both list at a point both collid
        //if both colid at null means no intersection and both colid at a node then there is intersection
        //if any reach at end of list assign it so head of other list
        while(tempA!=tempB){
            tempA=tempA==null?headB:tempA.next;
            tempB=tempB==null?headA:tempB.next;
        }
        return tempA;
    }
}