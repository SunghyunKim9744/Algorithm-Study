package 고득점Kit.해시.완주하지못한선수다시풀기;

import java.util.HashMap;
import java.util.Map;

public class GY {

	public static void main(String[] args) {
		String[] participant1 = { "leo", "kiki", "eden" };
		String[] completion1 = { "eden", "kiki" };
		solution(participant1, completion1);

		String[] participant2 = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] completion2 = { "josipa", "filipa", "marina", "nikola" };
		solution(participant2, completion2);

		String[] participant3 = { "mislav", "stanko", "mislav", "ana" };
		String[] completion3 = { "stanko", "ana", "mislav" };
		solution(participant3, completion3);
	}

	public static String solution(String[] participant, String[] completion) {
		String answer = "";

		Map<String, Integer> map = new HashMap<>();

		for (String s : participant)
			map.put(s, map.getOrDefault(s, 0) + 1);

		for (String s : completion)
			map.put(s, map.get(s) - 1);

		for (String s : map.keySet())
			if (map.get(s) == 1)
				answer = s;
		
		return answer;
	}

}
