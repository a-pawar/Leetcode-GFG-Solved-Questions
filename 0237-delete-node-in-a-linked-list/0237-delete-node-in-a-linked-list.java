/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        //value of next node
        int temp = node.next.val;
        node.val=temp;
        node.next=node.next.next;   
    }
}