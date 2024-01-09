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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1 = getList(root1);
        ArrayList<Integer> list2 = getList(root2);
        
        if(list1.size()!=list2.size()){
            return false;
        }
        
        for(int i=0;i<list1.size();i++){
            if(list1.get(i)!=list2.get(i)){
                return false;
            }
        }
        return true;
        
        
    }
    public ArrayList<Integer> getList(TreeNode root){
        if(root.left==null && root.right==null){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(root.val);
            return list;
        }
        ArrayList<Integer> leftList=new ArrayList<>();
        if(root.left!=null){
           leftList = getList(root.left);
        }
       
        if(root.right!=null){
              ArrayList<Integer> rightList = getList(root.right);
            leftList.addAll(rightList);
        }
         
        return leftList;
        
        
    }
}