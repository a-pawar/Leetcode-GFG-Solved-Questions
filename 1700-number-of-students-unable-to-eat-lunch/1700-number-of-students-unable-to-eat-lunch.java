class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int sand_index =0;
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<students.length;i++){
            q.add(students[i]);
        }

        while(!q.isEmpty()){
            int size = q.size();
            boolean isStudentGotLunch=false;

            for(int i=0;i<size;i++){
               if(sandwiches[sand_index]==q.peek()){
                    sand_index++;
                    q.poll();
                    isStudentGotLunch=true;
               }else{
                q.add(q.poll());
               }
            }
            if(!isStudentGotLunch){
                return q.size();
            }
        }
        return 0;
    }
}