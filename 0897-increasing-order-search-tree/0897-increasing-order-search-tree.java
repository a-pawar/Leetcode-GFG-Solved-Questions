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
    public TreeNode increasingBST(TreeNode root) {
        Queue<Integer> queue = new LinkedList<>();
        inorder(root,queue);
        TreeNode newroot = new TreeNode(queue.poll());
        TreeNode temp = newroot;
        while(!queue.isEmpty()){
            TreeNode node = new TreeNode(queue.poll());
            temp.right=node;
            temp=temp.right;

        }
        return newroot;
    }
    public void inorder(TreeNode node,Queue<Integer> queue){
        if(node==null){
            return;
        }
        inorder(node.left,queue);
        queue.add(node.val);
        inorder(node.right,queue);
    }
}