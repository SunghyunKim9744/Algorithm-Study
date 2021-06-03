package Level2Day05.N개의최소공배수;

import java.util.HashMap;
import java.util.Map;

public class Sh {

	public static void main(String[] args) {
		int[] arr = {2,6,8,14};
		
		int answer = solution(arr);

	}

	private static int solution(int[] arr) {
		int answer = 1;
        int[] prime = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,91,97};
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int num : prime)
            map.put(num,0);
        
        for(int num : arr){
            Map<Integer,Integer> numMap = new HashMap<>();
            while(num!=1){
                for(int i : prime){
                    if(num % i == 0){
                        numMap.put(i,numMap.getOrDefault(i,0)+1);
                        num /=i;
                        break;
                    }
                }
            }
            
            for(int key : numMap.keySet()) {
            	if(numMap.get(key) > map.get(key))
            		map.put(key, numMap.get(key));
            }
        }
        
        for(int key : map.keySet()) {
        	
        	for(int i=0; i<map.get(key); i++)
        		answer*=key;
        }
        return answer;
	}

}
