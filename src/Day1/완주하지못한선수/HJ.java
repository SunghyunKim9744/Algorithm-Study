package Day1.완주하지못한선수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class HJ {
	
	public static void main(String[] args) {
		String[] participant = { "mislav", "stanko", "mislav", "ana" };
		String[] completion = { "stanko", "ana", "mislav" };

		System.out.println(solution(participant, completion));
	}
	
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		List<String> totalParticipants = new LinkedList<>(Arrays.asList(participant));

		for(String name : completion) {
			if(totalParticipants.contains(name)) {
				int index = totalParticipants.indexOf(name);
				totalParticipants.remove(index);
			}
		}

		answer = totalParticipants.get(0);

		return answer;
	}

}
