/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder("");
        helper(root,sb);
        return sb.toString();

    }
    public void helper(TreeNode node,StringBuilder ans){
        if(node==null){
            ans.append("null,");
            return ;
        }
        String temp = String.valueOf(node.val);
        ans.append(temp+",");
        helper(node.left,ans);
        helper(node.right,ans);
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

        String [] arr = data.split(",");
        
        return helper2(arr,new int[]{0});

    }
    public TreeNode helper2(String [] arr,int []i){
        String val= arr[i[0]];
        i[0]++;

        if(val.charAt(0)=='n'){
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left=helper2(arr,i);
        node.right=helper2(arr,i);
        return node;
    }

}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));