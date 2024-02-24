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
    public ListNode removeElements(ListNode head, int val) {
        ListNode curr=head,newHead=null,temp=null;
        while(curr!=null){
            if(curr.val!=val){
                ListNode newnode = new ListNode(curr.val);
                if(newHead==null ){
                    newHead = newnode;
                    temp = newnode;
                }else{
                    
                    temp.next = newnode;
                    temp = newnode;
                }
            }
            curr=curr.next;
        }
        return newHead;
        
        
    }
}