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
        if(head == null || head.next==null){
            return;
        }
        int count = 0;
        ListNode node = head;
        while(node!=null){
            count++;
            node = node.next;
        }
        if(count%2 != 0){
            count = count+1; 
        }
        count = count/2;
        node = head;
        for(int i=1;i<count;i++){
            node=node.next;
        }
        ListNode revNode = reverse(node.next);
        node.next = null;
        ListNode l1 = head;
        ListNode l2 = revNode;

        while(l2!=null){
            ListNode temp = l1.next;
            l1.next = l2;
            ListNode temp1 = l2.next;
            l2.next = temp;
            l2 = temp1;
            if(l1.next!=null){
                l1 = l1.next.next;
            }
        }
        head = l1;

    }
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev = null;
        while(head!=null){
            ListNode temp = head.next;
            head.next = prev;
            prev=head;
            head = temp;
        }
        return prev;

    }
}