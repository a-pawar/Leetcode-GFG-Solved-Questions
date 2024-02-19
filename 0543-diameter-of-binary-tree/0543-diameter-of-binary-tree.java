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
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter-1;
    }
    public int height(TreeNode node) {
        if(node==null ){
            return 0;
        }
        int leftans=0,rightans=0;
        
        leftans=height(node.left);
        rightans=height(node.right);
        int dia = leftans+rightans+1;
        diameter=Math.max(dia,diameter);

        return 1+Math.max(leftans,rightans);
    }
}