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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
         List<Integer> list = new ArrayList<>();
        helper(root,ans,list);
        return ans;
    }
    public void helper(TreeNode node,List<String> ans,List<Integer> list){
        if(node == null ){
            return ;
        }
        list.add(node.val);
        if(node.left==null && node.right==null){
            StringBuilder sb= new StringBuilder();
            for(int i=0;i<list.size()-1;i++){
                sb.append(list.get(i)+"->");
            }
            sb.append(list.get(list.size()-1));
            ans.add(sb.toString());
        }
            helper(node.left,ans,list);
       
            helper(node.right,ans,list);
            
            
        list.remove(list.size()-1);
    }
}