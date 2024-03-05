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
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        int leftans=Integer.MAX_VALUE,rightans = Integer.MAX_VALUE;
        if(root.left!=null){
             leftans = minDepth(root.left);
        }
        if(root.right!=null){
             rightans = minDepth(root.right);
        }

        int ans = 1+Math.min(leftans,rightans);
        return ans;

    }
}