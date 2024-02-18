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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelsize = queue.size();
            List<Integer> currentlevel=new ArrayList<>();
            for(int i=0;i<levelsize;i++){
                TreeNode currentnode = queue.poll();
                currentlevel.add(currentnode.val);
                if(currentnode.left!=null){
                    queue.offer(currentnode.left);
                }
                if(currentnode.right!=null){
                    queue.offer(currentnode.right);
                }
            }
            result.add(currentlevel);
        }
        return result;
    }
}