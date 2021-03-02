package 고득점Kit.해시.완주하지못한선수다시풀기;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Sh {

	public static void main(String[] args) {

		String[] participant = {"leo", "kiki", "eden"};
		
		String[] completion = {"eden", "kiki"};
		
		String answer = solution(participant,completion); 
	}

	private static String solution(String[] participant, String[] completion) {
		String answer = "";
		
		Map<String,Integer> map = new HashMap<>();
		
		for(String str : participant)
			map.put(str, map.getOrDefault(str,0)+1);
		
		for(String str : completion)
			map.put(str, map.getOrDefault(str,0)-1);
		
		for(Entry<String,Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				answer = entry.getKey();
				break;
			}
		}
			
		return answer;
	}

}
