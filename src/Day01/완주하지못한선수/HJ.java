package Day01.완주하지못한선수;

import java.util.Arrays;

public class HJ {

	public static void main(String[] args) {
		String[] participant = { "mislav", "stanko", "mislav", "ana" };
		String[] completion = { "stanko", "ana", "mislav" };

		System.out.println(solution(participant, completion));
	}

	public static String solution(String[] participant, String[] completion) {
		String answer = "";

		Arrays.sort(participant);
		Arrays.sort(completion);

		for (int i = 0, len = completion.length; i < len; i++)
			if (!participant[i].equals(completion[i])) {
				answer = participant[i];
				break;
			}

		if (answer.equals(""))
			answer = participant[participant.length - 1];

		return answer;
	}

}
