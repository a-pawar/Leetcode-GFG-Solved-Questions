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
    public int pairSum(ListNode head) {
    //optimize 
        int n=0;//size
        ListNode node =head;
        while(node!=null){
            n++;
            node=node.next;
        }
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null,curr=slow,nextnode=slow.next;
        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=nextnode;
            if(nextnode!=null){
                nextnode=nextnode.next;
            }
        }
        ListNode reversehead=prev;
        node=head;
        int maxsum=0;
        for(int i=0;i<=(n/2)-1;i++){
        
           int sum  = node.val + reversehead.val;
            if(maxsum<sum){
                maxsum=sum;
            }
            node=node.next;
            reversehead=reversehead.next;
        }
        return maxsum;
        
        
    //Moderate
//         int n=0;
//         ListNode node =head;
//         while(node!=null){
//             n++;
//             node=node.next;
//         }
//         ListNode slow=head,fast=head;
//         while(fast!=null && fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }
//         //now slow at the mid of list so put last half list in stack
//         Stack<Integer> stack=new Stack<>();
//         while(slow!=null){
//             stack.push(slow.val);
//             slow=slow.next;
//         }
//         node =head;
//         int maxsum=0;
//         for(int i=0;i<=(n/2)-1;i++){
//             int lastelement = stack.pop();
//            int sum  = node.val + lastelement;
//             if(maxsum<sum){
//                 maxsum=sum;
//             }
//             node=node.next;
//         }
//         return maxsum;
        
    }
}