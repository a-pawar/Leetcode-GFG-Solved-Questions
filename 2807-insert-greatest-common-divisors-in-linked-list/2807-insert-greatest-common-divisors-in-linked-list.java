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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode node = head.next,prev=head;
        while(node!=null){
            int n1=prev.val,n2=node.val;
            int gcd = findGCD(n1,n2);
            ListNode newnode = new ListNode(gcd);
            newnode.next=prev.next;
            prev.next=newnode;
            
            prev=node;
            node=node.next;   
        }
        return head;
        
    }
    public int findGCD(int n1,int n2){
        int min=0;
        if(n1<n2){
            min=n1;
            if(n2%n1==0){
                return n1;
            }
        }else{
            min=n2;
            if(n1%n2==0){
                return n2;
            }
        }
        min=min/2+1;
        while(min>1){
            if(n1%min==0 && n2%min==0){
                return min;
            }
            min--;
        }
        return 1;
        
    }
}