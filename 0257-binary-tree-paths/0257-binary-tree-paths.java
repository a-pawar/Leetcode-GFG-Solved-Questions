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
        helper(root,ans,"");
        return ans;
    }
    public void helper(TreeNode node,List<String> ans,String path){
        if(node.left==null && node.right==null){
            int val = node.val;
            path=path+String.valueOf(val);
            ans.add(path);
        }
        if(node.left!=null){
            int val = node.val;
            String newpath = path+String.valueOf(val)+"->";
            helper(node.left,ans,newpath);
        }
        if(node.right!=null){
            int val = node.val;
            String newpath = path+String.valueOf(val)+"->";
            helper(node.right,ans,newpath);
        }
    }
}