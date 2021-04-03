package etc.카카오메이커스;

import java.util.HashMap;
import java.util.Map;

public class ps1 {

	public static void main(String[] args) {
		int[] gc1 = { 4, 5, 3, 2, 1 }, gc2 = { 5, 4, 5, 4, 5 };
		int[] w1 = { 2, 4, 4, 5, 1 }, w2 = { 1, 2, 3, 5, 4 };

		System.out.println(solution(gc1, w1));
		System.out.println(solution(gc2, w2));
	}

	public static int solution(int[] gift_cards, int[] wants) {
		int answer = 0;

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < gift_cards.length; i++) {
			map.put(gift_cards[i], map.getOrDefault(gift_cards[i], 0) + 1);
		}

		for (int i = 0; i < wants.length; i++) {
			map.put(wants[i], map.getOrDefault(wants[i], 0) - 1);
		}

		for (Integer i : map.keySet()) {
			if (map.get(i) < 0)
				answer++;
		}

		return answer;
	}

}
