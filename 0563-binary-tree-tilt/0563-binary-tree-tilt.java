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
    public int findTilt(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left =findSum(root.left);
        int right=findSum(root.right);
        int diff=Math.abs(left-right);
        int leftans=findTilt(root.left);
        int rightans=findTilt(root.right);
        return leftans+rightans+diff;

    }
    public  int findSum(TreeNode node){
        if(node==null){
            return 0;
        }
        int leftans = findSum(node.left);
        int rightans= findSum(node.right);
        return leftans+rightans+node.val;
    }
}