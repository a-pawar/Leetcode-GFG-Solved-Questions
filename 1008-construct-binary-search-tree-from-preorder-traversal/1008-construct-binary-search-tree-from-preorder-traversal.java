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
    public TreeNode bstFromPreorder(int[] preorder) {
       return helper(preorder ,0,preorder.length); 
    }
    public TreeNode helper(int [] preorder , int i,int j){
        if(i==j){
            return null;
        }
        if(i==j-1){
            TreeNode node = new TreeNode(preorder[i]);
            return node;
        }
        TreeNode node = new TreeNode(preorder[i]);
        int count=0;
        for(int k=i+1;k<j;k++){
            if(preorder[k]<preorder[i]){
                count++;
            }else{
                break;
            }
        }

        node.left = helper(preorder,i+1,i+1+count);
        node.right=helper(preorder,i+1+count,j);
        return node;
    }
}