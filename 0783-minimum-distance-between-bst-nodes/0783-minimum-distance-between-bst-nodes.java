/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDiffInBST(TreeNode root) {
        int ans = Integer.MAX_VALUE;
        int prev = -1;
        
        Stack<TreeNode> st = new Stack<>();
        TreeNode node =root;
         while(true){
            if(node!=null){
                st.push(node);
                node=node.left;
            }else{
                if(st.isEmpty()){
                    break;
                }
                node = st.pop();
                if(prev>=0){
                    ans = Math.min(ans,node.val-prev);
                }
                prev = node.val;
                //list.add(node.val);
                node=node.right;
            }
            
        }
        return ans;
    }
}