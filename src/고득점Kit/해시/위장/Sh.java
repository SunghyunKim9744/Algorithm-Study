package 고득점Kit.해시.위장;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Sh {

	public static void main(String[] args) {
		String[][] clothes1 = { { "yellowhat", "headgear" }, { "bluesunglasses", "eyewear" },
				{ "green_turban", "headgear" } };
		System.out.println(solution(clothes1));

		String[][] clothes2 = { { "crowmask", "face" }, { "bluesunglasses", "face" }, { "smoky_makeup", "face" } };
		System.out.println(solution(clothes2));
	}

	// (0.05ms, 51.3MB) - > (0.13ms, 52.2MB)
	public static int solution(String[][] clothes) {
		int answer = 1;
		Map<String,Integer> map = new HashMap<>();
		
		for(int i=0; i<clothes.length; i++) {
			String key = clothes[i][1];
			map.put(key, map.getOrDefault(key,0)+1);
		}
		

		for(Entry<String,Integer> entry : map.entrySet())
			answer *= (entry.getValue()+1);
		
		answer-=1;
		return answer;
	}


}
