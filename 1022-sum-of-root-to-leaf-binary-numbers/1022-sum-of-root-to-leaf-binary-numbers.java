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
        List<Integer> list = new ArrayList<>();
        return helper(root,list);
    }
    public int helper(TreeNode node , List<Integer> list){
        if(node.left==null && node.right==null){
            list.add(node.val);
            int temp=0;
            int pow=list.size()-1;
            for(int i=0;i<list.size();i++){
                temp=temp+ list.get(i)* (int)(Math.pow(2,pow));
                pow--;
            }
            list.remove(list.size()-1);
            return temp;
        }
        int leftans=0,rightans=0;
        list.add(node.val);
        if(node.left!=null){
            leftans=helper(node.left,list);
        }
        if(node.right!=null){
           rightans= helper(node.right,list);
        }
        list.remove(list.size()-1);
        return leftans+rightans;
    }
}