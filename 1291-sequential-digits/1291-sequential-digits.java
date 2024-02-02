class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<9;i++){
            int generateNum=i;
            while(high>=generateNum){
                int temp = generateNum%10+1;
                generateNum = generateNum*10+temp;
                if(low<=generateNum && generateNum<=high){
                    if(checkValid(generateNum)){
                        list.add(generateNum);
                    }
                    
                }
            }
        }
        Collections.sort(list); 
        return list;
    }

    public boolean checkValid(int num) {
            boolean isValid=false;
            int temp =num;
            int prev=temp%10;
            temp=temp/10;
            while(temp>0){
                int last = temp%10;
                if(prev==last+1){
                    prev=last;
                    temp=temp/10;
                }else{
                    break;
                }

            }
            if(temp==0){
                isValid=true;
            }
        
        return isValid;
    }
}