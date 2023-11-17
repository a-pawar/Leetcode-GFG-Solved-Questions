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
    public ListNode detectCycle(ListNode head) {
        // //save the in set and check if it found means there is cycle
        // Set<ListNode> set = new HashSet<>();
        // ListNode temp = head;
        // while(temp!=null){
        //     if(set.contains(temp)){
        //         return temp;
        //     }
        //     set.add(temp);
        //     temp=temp.next;
        // }
        // return null;

        //slow fast pointer approach
        if(head==null || head.next==null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        boolean cycle=false;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        //when slow and fast equal,remaining distance for 1st cycle node is eqaul to distance from head
        if(cycle){
            ListNode temp = head;
            while(slow!=temp){
                slow=slow.next;
                temp=temp.next;
            }
            return slow;
        }
        else{
            return null;
        }

    }
}