class Solution {

    public List<Integer> breadth_first_search(int first_person , int N , Map<Integer , List<int[]>> adjacency_list){

        boolean[] visited_array = new boolean[N];

        PriorityQueue<int[]> min_heap = new PriorityQueue<int[]>((a , b) -> (a[0] - b[0]));

        // Time , Person

        min_heap.add((new int[] {0 , 0}));

        min_heap.add((new int[] {0 , first_person}));

        while(!min_heap.isEmpty()){

            int[] current_meeting_details_array = min_heap.poll();

            int current_time = current_meeting_details_array[0];

            int current_node = current_meeting_details_array[1];

            if(visited_array[current_node]){
                continue;
            }

            visited_array[current_node] = true;

            for(int[] neighbour_node_meeting_details_array : adjacency_list.getOrDefault(current_node , (new ArrayList<int[]>()))){

                int neighbour_node = neighbour_node_meeting_details_array[0];

                int neighbour_node_time = neighbour_node_meeting_details_array[1];

                if(visited_array[neighbour_node]){
                    continue;
                }

                if(neighbour_node_time >= current_time){
                    min_heap.add((new int[] {neighbour_node_time , neighbour_node}));
                }
            }
        }

        List<Integer> persons_who_knows_secrets_list = new ArrayList<Integer>();

        for(int node = 0 ; (node < N) ; node++){
            
            if(visited_array[node]){
                
                persons_who_knows_secrets_list.add(node);
            }
        }

        return persons_who_knows_secrets_list;
    }

    public List<Integer> findAllPeople(int N , int[][] meetings_matrix , int first_person){

        Map<Integer , List<int[]>> adjacency_list = new HashMap<>();

        for(int[] meeting_details_array : meetings_matrix){

            int node_1 = meeting_details_array[0];

            int node_2 = meeting_details_array[1];

            int time = meeting_details_array[2];

            adjacency_list.computeIfAbsent(node_1 , (k -> (new ArrayList<>()))).add((new int[] {node_2 , time}));

            adjacency_list.computeIfAbsent(node_2 , (k -> (new ArrayList<>()))).add((new int[] {node_1 , time}));
        }
        
        return breadth_first_search(first_person , N , adjacency_list);
    }
}