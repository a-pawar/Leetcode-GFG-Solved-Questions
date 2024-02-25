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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result =new ArrayList<>();
        if(root==null){
            return result;
        }
        Deque<TreeNode> dq = new LinkedList<>();
        dq.addFirst(root);
        boolean reverse = false;
        
        while(!dq.isEmpty()){
            int levelSize=dq.size();
            List<Integer> currentLevel = new ArrayList<>();
            for(int i=0;i<levelSize;i++){
                if(!reverse){
                    TreeNode currentNode = dq.pollFirst();
                    currentLevel.add(currentNode.val);
                    if(currentNode.left!=null){
                        dq.addLast(currentNode.left);
                    }
                    if(currentNode.right!=null){
                        dq.addLast(currentNode.right);
                    }
                }else{
                    TreeNode currentNode = dq.pollLast();
                    currentLevel.add(currentNode.val);
                    if(currentNode.right!=null){
                        dq.addFirst(currentNode.right);
                    }
                    if(currentNode.left!=null){
                        dq.addFirst(currentNode.left);
                    }
                    
                }
            }
            reverse = !reverse;
            result.add(currentLevel);
        }
        return result;



    }
}