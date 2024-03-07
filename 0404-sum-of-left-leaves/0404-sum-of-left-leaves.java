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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null){
            return 0;
        }
        return helper(root,false);
    }
    public int helper(TreeNode node , boolean isleft){
        if(node==null){
            return 0;
        }
        if(node.left==null && node.right==null){
            if(isleft){
                return node.val;
            }
            return 0;
        }

        int ansleft = helper(node.left,true);
        int ansright = helper(node.right,false);
        return ansleft+ansright;
    }
}