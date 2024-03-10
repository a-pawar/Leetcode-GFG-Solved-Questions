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
    public int sumRootToLeaf(TreeNode root) {
        
        return helper(root,0);
    }
    public int helper(TreeNode node ,int sum){
        if(node==null){
            return 0;
        }
        sum=2*sum+node.val;

        if(node.left==null && node.right==null){
            return sum;
        }
        int leftans=0,rightans=0;
            leftans=helper(node.left,sum);
        
           rightans= helper(node.right,sum);
        
        return leftans+rightans;
    }
}