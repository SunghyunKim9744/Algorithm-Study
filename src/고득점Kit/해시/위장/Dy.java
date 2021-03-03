package 고득점Kit.해시.위장;

import java.util.HashMap;
import java.util.Map;

// 11:22 ~ 11:46
public class Dy {

	public static void main(String[] args) {
		String[][] clothes = { { "yellowhat", "headgear" }, { "bluesunglasses", "eyewear" },
				{ "green_turban", "headgear" } };
		System.out.println(solution(clothes));
	}
// 테스트 27 〉	통과 (0.04ms, 52.1MB) 테스트 7 〉	통과 (0.14ms, 52.3MB)
	public static int solution(String[][] clothes) {
		int answer = 1;
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0; i<clothes.length; i++) {
			map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 1)+1);
		}
		for (String key : map.keySet()) {
			answer *= map.get(key);
        }
		answer--;
		return answer;
	}

}
