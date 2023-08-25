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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      //i and j variable for traversing l1 and l2 list respectivly
      int carry =0;
      ListNode ansList = null;
      ListNode head = null;
      int sum =0;
      int onceDigit =0;
      while(l1!=null && l2!=null){
           sum = l1.val+l2.val+carry;
           carry=0;
           onceDigit = sum;
          if(sum>9){
              onceDigit = sum%10;
              carry=1;
          }
          ListNode newNode = new ListNode(onceDigit);
          if(ansList == null){
              ansList = newNode;
              head = newNode;
          }
          else{
              ansList.next = newNode;
              ansList = newNode;
          }
            l1 = l1.next;
            l2 = l2.next;
      }
      while(l1!=null){
           sum = l1.val+carry;
           carry=0;
           onceDigit = sum;
          if(sum>9){
              onceDigit = sum%10;
              carry=1;
          }
          ListNode newNode = new ListNode(onceDigit);
          if(ansList == null){
              ansList = newNode;
              head = newNode;
          }
          else{
              ansList.next = newNode;
              ansList = newNode;
          }
            l1 = l1.next;
      }
      while( l2!=null){
           sum = l2.val+carry;
           carry=0;
           onceDigit = sum;
          if(sum>9){
              onceDigit = sum%10;
              carry=1;
          }
          ListNode newNode = new ListNode(onceDigit);
          if(ansList == null){
              ansList = newNode;
              head = newNode;
          }
          else{
              ansList.next = newNode;
              ansList = newNode;
          }
            l2 = l2.next;
      }
      
      if(carry==1){
          ListNode newNode = new ListNode(1);
          ansList.next = newNode;
              ansList = newNode;
      }

        return head;
    }
}