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
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx=findNode(root,x);
        TreeNode yy=findNode(root,y);

        return ((level(root,xx,0)==level(root,yy,0)) && (!siblings(root,xx,yy)));
    }
    public boolean siblings(TreeNode node , TreeNode x,TreeNode y){
        if(node==null){
            return false;
        }
        if(node.left==x && node.right==y || node.left==y&&node.right==x){
            return true;
        }
        boolean leftans = siblings(node.left,x,y);
        if(leftans){
            return true;
        }
        boolean rightans=siblings(node.right,x,y);
        return rightans;
    }
    public int level(TreeNode node ,TreeNode x,int l){
        if(node==null){
            return 0;
        }
        if(node==x){
            return l;
        }
        int leftans = level(node.left,x,l+1);
        if(leftans!=0){
            return leftans;
        }
        int rightans = level(node.right,x,l+1);
        return rightans;
    }
    public TreeNode findNode(TreeNode node,int i){
        if(node==null){
            return null;
        }
        if(node.val==i){
            return node;
        }
        TreeNode leftans = findNode(node.left,i);
        if(leftans!=null){
            return leftans;
        }
        TreeNode rightans = findNode(node.right,i);
        return rightans;
    }
}