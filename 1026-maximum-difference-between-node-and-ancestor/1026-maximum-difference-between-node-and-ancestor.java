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
    public int maxAncestorDiff(TreeNode root) {
        int traverse = traverseBST(root,0);
        return traverse;
    }
    public int traverseBST(TreeNode root,int max){
        if(root == null){
            return 0;
        }

        int leftans = findMax(root.left,root.val);
        int rightans = findMax(root.right,root.val);
        if(leftans>max){
            max=leftans;
        }
        if(rightans>max){
            max=rightans;
        }
        int lm= traverseBST(root.left,max);
        int rm =traverseBST(root.right,max);
        if(lm>max){
            max=lm;
        }if(rm>max){
            max=rm;
        }
        return max;
    }
    public int findMax(TreeNode root,int val){
        if(root==null){
            return 0;
        }
        int temp = Math.abs(val-root.val);
        int ansL = findMax(root.left,val);
        int ansR = findMax(root.right,val);

        if(ansL>temp){
            temp=ansL;
        }if(ansR>temp){
            temp=ansR;
        }
        return temp;
    }
}