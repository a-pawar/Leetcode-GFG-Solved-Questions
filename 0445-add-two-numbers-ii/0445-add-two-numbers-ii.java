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
         l1 = reverse(l1);
         l2 = reverse(l2);
        ListNode l3=null ;
        ListNode l3Head=null;
        
        int carry=0;
        while(l1!=null && l2!=null){
            int temp = l1.val + l2.val+carry;
            carry=0;
            
            if(temp>=10){
               carry=1;
                temp = temp%10;
            }
            ListNode node = new ListNode(temp);
                if(l3==null){
                     l3Head=node;
                     l3=node;
                    
                }else{
                    l3.next=node;
                    l3=l3.next;
                }
            
            l1=l1.next;
            l2=l2.next;
            
        }
        while(l1!=null ){
            int temp = l1.val +carry;
            carry=0;
            
            if(temp>=10){
               carry=1;
                temp = temp%10;
            }
            ListNode node = new ListNode(temp);
                if(l3==null){
                     l3Head=node;
                     l3=node;
                    
                }else{
                    l3.next=node;
                    l3=l3.next;
                }
            
            l1=l1.next;
        }
        while( l2!=null){
            int temp = l2.val+carry;
            carry=0;
            
            if(temp>=10){
               carry=1;
                temp = temp%10;
            }
            ListNode node = new ListNode(temp);
                if(l3==null){
                     l3Head=node;
                     l3=node;
                    
                }else{
                    l3.next=node;
                    l3=l3.next;
                }
            
            l2=l2.next;
        }
        if(carry==1){
            ListNode node = new ListNode(1);
            l3.next = node;
        }
        ListNode ans = reverse(l3Head);
        
        return ans;
        
    }
    public ListNode reverse(ListNode temp){
        
        ListNode prev = null;
        ListNode next1=null;
        while(temp!=null){
             next1 = temp.next;
            temp.next = prev;
            prev=temp;
            temp=next1;
        }
        return prev;  
    }
}