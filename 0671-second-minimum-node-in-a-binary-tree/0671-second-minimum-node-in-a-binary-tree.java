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
    public int findSecondMinimumValue(TreeNode root) {
        int min = root.val;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        long secMin = Long.MAX_VALUE;
        while(!queue.isEmpty()){
            int len = queue.size();
            for(int i=0;i<len;i++){
                TreeNode node = queue.poll();
                
                if(node.val>min && node.val<secMin ){
                    secMin=node.val;
                }
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
        }
        
        if(secMin==Long.MAX_VALUE){
            secMin=-1;
        }
        return (int)secMin;

    }
}