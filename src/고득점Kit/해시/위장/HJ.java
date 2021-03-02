package 고득점Kit.해시.위장;

import java.util.*;

public class HJ {

	/*
	 * { { "yellowhat", "headgear" }, { "bluesunglasses", "eyewear" }, {
	 * "green_turban", "headgear" } }; { { "crowmask", "face" }, { "bluesunglasses",
	 * "face" }, { "smoky_makeup", "face" } };
	 * 
	 */
	public static void main(String[] args) {
		String[][] clothes = { { "yellowhat", "headgear" }, { "bluesunglasses", "eyewear" },
				{ "green_turban", "headgear" } };
		System.out.println(solution(clothes));
	}

	public static int solution(String[][] clothes) {
		int answer = 0;
		Map<String, Integer> closet = new HashMap<>();

		for (int i = 0, len = clothes.length; i < len; i++) {
			String key = clothes[i][1];
			closet.put(key, closet.getOrDefault(key, 0) + 1);
		}
		
		
		return answer;
	}

}
