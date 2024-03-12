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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummyNode =  new ListNode(0,head);
        Map<Integer,ListNode> map= new HashMap<>();
        map.put(0,dummyNode);
        int prefixsum=0;
        
        while(head!=null){
            prefixsum += head.val;
            if(map.containsKey(prefixsum)){
                //delete the prefix sum for intermediatry node
                ListNode start = map.get(prefixsum);
                ListNode temp = start.next;
                int sum = prefixsum;
                while(temp!=head){
                    sum+=temp.val;
                    map.remove(sum);
                    temp=temp.next;
                }
                start.next = head.next;
            }
            else{
                map.put(prefixsum,head);
            }
            head=head.next;
        }
        return dummyNode.next;
    }
}