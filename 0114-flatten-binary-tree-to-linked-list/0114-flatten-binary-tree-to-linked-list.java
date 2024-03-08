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
    public void flatten(TreeNode root) {
        TreeNode currNode = root;
        while(currNode!=null){
            if(currNode.left!=null){
                TreeNode temp = currNode.left;
                //find rightmost empty node
                while(temp.right!=null){
                    temp=temp.right;
                }
                temp.right=currNode.right;
                currNode.right=currNode.left;
                currNode.left=null;
            }
            currNode=currNode.right;
        }

    }
}