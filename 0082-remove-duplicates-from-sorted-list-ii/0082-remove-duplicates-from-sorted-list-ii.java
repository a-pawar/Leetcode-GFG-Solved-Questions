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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode newhead=null,temp=null,node=head;
        ListNode prev=head,curr=head.next;
        while(curr!=null){
            if(prev.val!=curr.val){
                if(newhead==null){
                    newhead=prev;
                    temp=prev;
                    prev=curr;
                    curr=curr.next;
                }else{
                    temp.next=prev;
                    temp=prev;
                    prev=curr;
                    curr=curr.next;
                }
            }else{
                //skip the duplicate
                while(curr!=null && prev.val == curr.val){
                    prev=curr;
                    curr=curr.next;
                }
                
                prev=curr;
                if(curr!=null){
                    curr=curr.next;
                }
                   
            }
        }
        if(prev!=null){
            if(newhead==null){
                newhead=prev;
                temp=prev;
            }else{
                temp.next=prev;
            }
            
        }else{
            if(temp!=null){
                temp.next=null;
            }  
        }
        return newhead;
    }
}