class Solution {
    public boolean isValidSerialization(String preorder) {
        if(preorder.equals("#")) return true;
        String arr [] = preorder.split(",");
        if(arr[0].equals("#")) return false;
//BFS
        Queue<String> q = new LinkedList<>();
        q.add(arr[0]);
        int i=0,n=arr.length;
        while(!q.isEmpty()){
            q.poll();
            i++;
            if(n==i) return false;
            if(!arr[i].equals("#")) q.add(arr[i]);

            i++;
            if(n==i) return false;
            if(!arr[i].equals("#")) q.add(arr[i]);

        }
        return i==n-1;
    }
}