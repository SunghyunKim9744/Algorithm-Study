package Day1.완주하지못한선수;

import java.util.Arrays;

public class Gy {

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

		Arrays.sort(participant);
		Arrays.sort(completion);

		for (int i = 0; i < participant.length; i++) {
//			System.out.println(i + " " + participant[i]);
			if (i == participant.length - 1) {
				answer = participant[i];
			} else if (!completion[i].equals(participant[i])) {
				answer = participant[i];
				break;
			}
		}
//		System.out.println(answer);
		return answer;

	}

}
