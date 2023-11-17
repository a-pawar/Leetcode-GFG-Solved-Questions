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
import java.util.*;
class Solution {
    public boolean isPalindrome(ListNode head) {
        // //bruteforce
        // ArrayList<Integer> arr=new ArrayList<>();
        // while(head != null) {
        //     arr.add(head.val);
        //     head = head.next;
        // }
        // for(int i=0;i<arr.size()/2;i++) 
        //     if(arr.get(i) != arr.get(arr.size()-i-1)) return false;
        // return true;
        
        //optimized
        //if list has no elment or only one element
        if(head==null || head.next==null){
            return true;
        }
        //first find the midle of LL
        ListNode slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //now reverse the list from middle
        ListNode revHead= reverseLL(slow.next);
        slow.next=revHead;
        slow=slow.next;
        //now compare from start and middle
        ListNode temp = head;
        while(slow!=null){
            if(temp.val != slow.val){
                return false;
            }
            temp=temp.next;
            slow=slow.next;
        }
        return true;

    }
    public ListNode reverseLL(ListNode head ){
        ListNode prev = null;
        
        ListNode store = head.next;
        while(store!=null){
            head.next=prev;
            prev=head;
            head=store;
            store=store.next;
        }
        head.next=prev;
        return head;
    }
}