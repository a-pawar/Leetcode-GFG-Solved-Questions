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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0 ){
            return null;
        }
        if(lists.length==1){
            return lists[0];
        }
        ListNode ans = mergeTwoSortedList(lists[0],lists[1]);
        for(int i=2;i<lists.length;i++){
             ans = mergeTwoSortedList(ans,lists[i]);
        }
        return ans;
    }
    private ListNode mergeTwoSortedList(ListNode head1,ListNode head2){
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
        ListNode newhead=null,node1=head1,node2=head2,temp=null;
        if(node1.val<node2.val){
            newhead=node1;
            temp=node1;
            node1=node1.next;
        }else{
            newhead=node2;
            temp=node2;
            node2=node2.next;
        }
        while(node1!=null && node2!=null){
            if(node1.val<node2.val){
                temp.next = node1;
                temp=node1;
                node1=node1.next;     
            }else{
                temp.next = node2;
                temp=node2;
                node2=node2.next;
            }
        }
        if(node1!=null){
            temp.next=node1;
        }
        if(node2!=null){
            temp.next=node2;
        }
        return newhead;
    }
}