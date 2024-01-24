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
    public int pseudoPalindromicPaths (TreeNode root) {
        int[] arr= new int[10];
        return pseudoPalindromicPathsHelper(root,arr);
    }
    public int pseudoPalindromicPathsHelper(TreeNode root,int [] arr){
        if(root.left==null && root.right==null){
            arr[root.val]=arr[root.val]+1;
            if(isPalindrome(arr)){
                arr[root.val]=arr[root.val]-1;
                return 1;
            }
            arr[root.val]=arr[root.val]-1;
            return 0;
        }
        arr[root.val]=arr[root.val]+1;
        int leftAns=0,rightAns=0;
        if(root.left!=null){
             leftAns = pseudoPalindromicPathsHelper(root.left,arr);
            
        }
        if(root.right!=null){
             rightAns = pseudoPalindromicPathsHelper(root.right,arr);
            
        }
        arr[root.val]=arr[root.val]-1;
        
        return leftAns+rightAns;
    }
    public boolean isPalindrome(int [] arr){
        
        //one odd isallow in palindrome 
        boolean oneOdd=false;
        for(int i=1;i<arr.length;i++){
            if(arr[i]%2!=0){
                if(oneOdd){
                    return false;
                }
                oneOdd=true;
            }
        }
        return true;
    }
}