package 고득점Kit.해시.베스트앨범;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sh {

	public static void main(String[] args) {
		String[] genres = { "classic", "pop", "classic", "classic", "pop" };
		int[] plays = { 500, 600, 150, 800, 2500 };
		System.out.println(solution(genres, plays));
	}

	// (0.65ms, 52.5MB) - > (3.26ms, 52MB)
	public static int[] solution(String[] genres, int[] plays) {
		int[] answer = {};
		Map<String, Integer> total = new HashMap<>();

		for (int i = 0; i < genres.length; i++) {
			total.put(genres[i], total.getOrDefault((genres[i]), 0) + plays[i]);
		}

		List<String> list = new ArrayList<>(total.keySet());
		Collections.sort(list, (o1, o2) -> total.get(o2).compareTo(total.get(o1)));

		
		List<Integer> answerList = new ArrayList<>();
		for (String str : list) {
			int[] play = new int[2];
			int maxIdx = -1;
			int secondIdx = -1;
			int maxValue = 0;
			int secondValue = 0;
			for (int i = 0; i < plays.length; i++) {
				if (genres[i].equals(str)) {
					if (secondValue < plays[i] && plays[i] <= maxValue) {
						secondValue = plays[i];
						secondIdx = i;
					} 
					else if (maxValue < plays[i]) {
						secondValue = maxValue;
						secondIdx = maxIdx;
						maxIdx = i;
						maxValue = plays[i];
					}

				}
			}
			
			answerList.add(maxIdx);
			if(secondValue != 0)
				answerList.add(secondIdx);
			
		}
		
		answer = new int[answerList.size()];
		int index = 0;
		for(int i : answerList)
			answer[index++] = i;
		return answer;
	}
}
