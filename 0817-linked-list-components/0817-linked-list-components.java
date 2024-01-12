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
    public int numComponents(ListNode head, int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        boolean isconnected = false;
        ListNode node = head;
        while(node!=null){
            int val = node.val;
            boolean isfound = search(nums,val);
            if(isfound){
                isconnected=true;
                
            }else{
                if(isconnected){
                    isconnected = false;
                    ans++;
                }
            }
            node=node.next;
        }
        if(isconnected){
            ans++;
        }
        return ans;
    }
    public boolean search(int  [] nums,int val){
        int s =0,e=nums.length-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(nums[mid]==val){
                return true;
            }else if(nums[mid]<val){
                s = mid+1;
            }else{
                e=mid-1;
            }
        }
        return false;
    }
}