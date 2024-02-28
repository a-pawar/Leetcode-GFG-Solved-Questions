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
    public TreeNode invertTree(TreeNode root) {
        
        return invertTreeHelper(root);
    }
    public TreeNode invertTreeHelper(TreeNode node) {
        if(node==null){
            return null;
        }
        TreeNode leftnode=invertTreeHelper(node.left);
        TreeNode rightnode= invertTreeHelper(node.right);

        node.left=rightnode;
        node.right=leftnode;
        return node;
    }
}