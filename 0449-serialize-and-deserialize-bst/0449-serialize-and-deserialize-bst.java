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
        StringBuilder sb = new StringBuilder();
        helper(root,sb);
        
        return sb.toString();
    }
    public void helper(TreeNode node , StringBuilder sb){
        if(node==null){
            sb.append("null,");
            return;
        }
        sb.append(String.valueOf(node.val)+",");
        helper(node.left,sb);
        helper(node.right,sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String [] arr = data.split(",");
        return helper2(arr,new int[]{0});
    }
    public TreeNode helper2(String[] arr, int[] i){
        if(arr[i[0]].charAt(0)=='n'){
            i[0]++;
            return null;
        }
        int val =Integer.parseInt(arr[i[0]]);
        TreeNode node = new TreeNode(val);
        i[0]++;
        node.left = helper2(arr,i);
        node.right=helper2(arr,i);
        return node;
    }

}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;