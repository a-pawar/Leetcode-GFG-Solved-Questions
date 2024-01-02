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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode newhead=null,less=null,node=head,store=null,prev=null,greater=null;

        while(node!=null){
            if( node.val<x){
                if(newhead==null){
                    newhead=node;
                    less=node;
                    if(node!=head){
                        prev.next=node.next;
                        newhead.next=head;
                        node=prev;
                    }
                }else{
                    //condition for till now all element are small
                    if(greater!=null){
                        
                    prev.next=node.next;
                    node.next=less.next;
                    less.next=node;
                    less=node;
                    node=prev;
                    }else{
                       less=node; 
                    }
                }
                
            }else{
                greater=node;
            }
            prev=node;
            node=node.next;
        }
        if(newhead==null){
            newhead=head;
        }
        
        return newhead;
    }
}