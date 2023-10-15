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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newHead=null,temp=null;
        //compare first node of both linkedlist
        //make newHead , and a temp variable which helps in traverse through list
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        
        if(list1.val<list2.val){
            newHead=list1;
            temp=list1;
            list1 = list1.next;
        }else{
            newHead=list2;
            temp=list2;
            list2 = list2.next;
        }
        //now traverse through both list , and smaller node is added in new list or manipulate next to make new list
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                temp.next = list1;
                temp = temp.next;
                list1 = list1.next;
            }else{
                temp.next = list2;
                temp = temp.next;
                list2 = list2.next;
            }
        }
        //append remaining list1 in new list
        if(list1!=null ){
            temp.next = list1;
        }
        //append remaining list2 in new list
        if( list2!=null){
            temp.next = list2;
        }
        return newHead;
    }
}