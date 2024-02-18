class Solution {
    public int mostBooked(int n, int[][] meetings) {
        int m = meetings.length;
        // Using built-in sort function Arrays.sort
        Arrays.sort(meetings, new Comparator<int[]>() {
            @Override
            // Compare values according to columns
            public int compare(final int[] entry1,
                               final int[] entry2)
            {
 
                // To sort in descending order revert
                // the '>' Operator
                if (entry1[0] > entry2[0])
                    return 1;
                else
                    return -1;
            }
        }); // End of function call sort().
        long [] lastAvailableTime = new long[n];
        int [] roomsUseCount=new int[n];

        for(int i=0;i<m;i++){
            int start=meetings[i][0];
            int end=meetings[i][1];
            boolean found=false;
            int duration=end-start;
            long earlyEndRoomTime=Long.MAX_VALUE;
            int earlyEndRoom=0;
            //find the first availble room for current meeting
            for(int room=0;room<n;room++){
                if(lastAvailableTime[room]<=start){
                    lastAvailableTime[room]=end;
                    roomsUseCount[room]++;
                    found=true;
                    break;
                }
                //keep track of earlyroomend
                if(lastAvailableTime[room]<earlyEndRoomTime){
                    earlyEndRoomTime=lastAvailableTime[room];
                    earlyEndRoom=room;
                }
                
            }
            
            //if couldn't found room
            if(!found){
                //pick room which will end first
                lastAvailableTime[earlyEndRoom] += duration;
                roomsUseCount[earlyEndRoom]++;

            }

        }
        int result=-1;
        int maxuse=0;
        for(int room=0;room<n;room++){
            if(roomsUseCount[room]>maxuse){
                maxuse=roomsUseCount[room];
                result=room;
            }
        }
        return result;

    }
}