class Solution {
    public int numberOfBeams(String[] bank) {
        int [] device = new int[bank.length];
        for(int i=0;i<bank.length;i++){
            String s = bank[i];
            //count devices in each row
            int count=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='1'){
                    count++;
                }
            }
            device[i]=count;
        }

        int lasercount=0;
        //calculate the laser with each rows
        for(int i=0;i<device.length;i++){
            //next rows
            for(int j=i+1;j<device.length;j++){
                if(device[j]!=0){
                    lasercount=lasercount+device[i]*device[j];
                    break;
                }
            }
        }
        return lasercount;
    }
}