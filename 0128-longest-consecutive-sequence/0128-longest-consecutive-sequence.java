class Solution {
    public int longestConsecutive(int[] arr) {
			
		if(arr.length<=1){
			return arr.length;
		}
		HashMap<Integer,Boolean> map = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			map.put(arr[i],true);
		}
		Set<Integer> keys = map.keySet();
		int maxLength = 0;
		int start = 0;
		int curStart=0;
		int num=0;
		int count=0;
		for(int key : keys ){
			if(!map.get(key)){
				continue;
			}
			 curStart =key;
			 num = key+1;
			count=1;
			while(map.containsKey(num) && map.get(num)){
				count++;
				map.put(num, false);
				num++;
			}
			num = key-1;
			while(map.containsKey(num) && map.get(num)){
				count++;
				curStart = num;
				map.put(num, false);
				num--;
			}
			if(count>maxLength){
				start = curStart;
				maxLength = count;
			}
		}
		return maxLength;
    }
}