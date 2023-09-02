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
    public ListNode reverseKGroup(ListNode head, int k) {
        int count =0;
        ListNode store = head;
        ListNode temp = head;
        ListNode headAns = null;
        ListNode StoreSmallListTail = null;
        if(k==1){
            return head;
        }
        while(true){
            temp = store;
            while(store!=null && count!=k){
                count++;
                store = store.next;
            }
            if(count<k){
                StoreSmallListTail.next = temp;
                break;
            }else{
                count=0;
            }
            headTailReturn smallList = reverseList(temp,k);
            temp = store;
            if(headAns==null){
                headAns = smallList.head;
                StoreSmallListTail = smallList.tail;
            }else{
                StoreSmallListTail.next = smallList.head;
                StoreSmallListTail = smallList.tail;
            }
        }
        return headAns;
    }
    public headTailReturn reverseList(ListNode head, int k) {
        ListNode headAns=null,tailAns=head;
        ListNode prev=null,cur=head,next1=null;
        int count=0;
        while(cur != null && k!=count){
            next1 = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next1;
            count++;
        }
        headAns = prev;
        headTailReturn smallAns= new headTailReturn(headAns,tailAns);
        return smallAns;
    }
}
class headTailReturn{
    ListNode head;
    ListNode tail;
    headTailReturn(){
        head = null;
        tail = null;
    }
    headTailReturn(ListNode head, ListNode tail){
        this.head = head;
        this.tail = tail;
    }
}