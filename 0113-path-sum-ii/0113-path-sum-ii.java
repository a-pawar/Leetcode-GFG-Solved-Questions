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
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> answer = new ArrayList<>();
        if(root == null){
            return answer;
        }
        List<Integer> inner = new ArrayList<>();
        
        
         helper(root,targetSum,inner,answer);
        
        return answer;
        
    }
    public List<List<Integer>> helper(TreeNode node, int targetSum, List<Integer> inner,List<List<Integer>> answer){
        if(node==null){
            return answer;
        }
        inner.add(node.val);
       
        if(node.left==null && node.right==null && node.val==targetSum){
            
            answer.add(new ArrayList<>(inner));
            // System.out.println(answer);
           
        }
         
        helper(node.left,targetSum-node.val,inner,answer);
        helper(node.right,targetSum-node.val,inner,answer);
        int temp =inner.remove(inner.size()-1);
        return answer;
        
         
    }
}