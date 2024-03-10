/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        return helper(root,list);
    }
    private List<Integer> helper(Node node , List<Integer> list){
        if(node==null){
            return list;
        }
        List<Node> children = node.children;
        
        for(int i=0;i<children.size();i++){
            
            helper(children.get(i),list);
        }
        list.add(node.val);
        
        return list;
    }
}