package 고득점Kit.해시.위장;

import java.util.HashMap;
import java.util.Map;

public class GY {

	public static void main(String[] args) {
		String[][] clothes1 = { { "yellowhat", "headgear" }, { "bluesunglasses", "eyewear" },
				{ "green_turban", "headgear" } };
		System.out.println(solution(clothes1));

		String[][] clothes2 = { { "crowmask", "face" }, { "bluesunglasses", "face" }, { "smoky_makeup", "face" } };
		System.out.println(solution(clothes2));
	}

	public static int solution(String[][] clothes) {
		int answer = 1;

		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < clothes.length; i++) {
			map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
		}

		for (String key : map.keySet())
			answer *= map.get(key) + 1;

		return answer - 1;
	}

}