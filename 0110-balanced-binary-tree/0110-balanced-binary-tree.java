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
    public boolean isBalanced(TreeNode root) {
        int height= helper(root);
        if(height!=-1){
            return true;
        }
        return false;
    }
    public int helper(TreeNode root){
        if(root==null){
            return 0;
        }
        int lans = helper(root.left);
        if(lans==-1){
            return lans;
        }
        int rans = helper(root.right);
        if(rans==-1){
            return rans;
        }
        int diff = Math.abs(lans-rans);
        if(diff<=1){
            return 1+Math.max(lans,rans);
        }
        return -1; 
    }
}