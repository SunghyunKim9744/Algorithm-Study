package Day1.완주하지못한선수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HJ {
	/*
	 * 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
	 * completion의 길이는 participant의 길이보다 1 작습니다.
	 * 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
	 * 참가자 중에는 동명이인이 있을 수 있습니다.
	 */

	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		List<String> totalParticipants = new ArrayList<>(Arrays.asList(participant));
		
		for(String name : completion) {
			if(totalParticipants.contains(name)) {
				int index = totalParticipants.indexOf(name);
				totalParticipants.remove(index);
			}
		}
		
		answer = totalParticipants.get(0);
		
		return answer;
	}

	public static void main(String[] args) {
		String[] participant = { "mislav", "stanko", "mislav", "ana" };
		String[] completion = { "stanko", "ana", "mislav" };

		solution(participant, completion);
	}

}
