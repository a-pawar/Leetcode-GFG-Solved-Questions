class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> stack = new Stack<>();
        for(int i=sandwiches.length-1;i>=0;i--){
            stack.push(sandwiches[i]);
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<students.length;i++){
            queue.add(students[i]);
        }
        int count=0;
        while(!queue.isEmpty() && !stack.isEmpty()){
            if(stack.size()==count){
                break;
            }
            count++;
            if(stack.peek()==queue.peek()){
                stack.pop();
                queue.poll();
                count=0;
            }else{
                queue.add(queue.poll());
            }
        }
        return queue.size();
    }
}