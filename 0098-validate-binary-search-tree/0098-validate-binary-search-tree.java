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
  class pair<T,U,V>{
	 T minimum;
	 U maximum;
	 V ansIsBST;
	 public pair(T min,U max,V bool){
		 minimum = min;
		 maximum = max;
		 ansIsBST = bool;
	 }
 }
class Solution {
    public boolean isValidBST(TreeNode root) {
        	if(root == null){
			return true;
		}
		pair<Long,Long,Boolean> temp= isBSThelper(root);
		return temp.ansIsBST;
    }
    public static pair<Long,Long,Boolean> isBSThelper(TreeNode root) {
		if(root==null){
			long max = Long.MIN_VALUE;
			long min = Long.MAX_VALUE;
			boolean bool = true;
			pair<Long,Long,Boolean> obj =new pair<Long,Long,Boolean>(min,max,bool);
			return obj;
		}
		pair<Long,Long,Boolean> leftAns = isBSThelper(root.left);
		pair<Long,Long,Boolean> rightAns = isBSThelper(root.right);

		if(leftAns.maximum >= root.val){
			leftAns.ansIsBST = false;
			
		}
		if(root.val >= rightAns.minimum){
			rightAns.ansIsBST= false;
		}
		

		long max = Math.max(root.val,Math.max(leftAns.maximum,rightAns.maximum));
		long min = Math.min(root.val,Math.min(rightAns.minimum,leftAns.minimum));
		boolean bool = leftAns.ansIsBST&&rightAns.ansIsBST;
		
		pair<Long,Long,Boolean> obj =new pair<Long,Long,Boolean>(min,max,bool);
		return obj;
	}
}