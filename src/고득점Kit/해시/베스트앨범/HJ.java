package 고득점Kit.해시.베스트앨범;

import java.util.*;

public class HJ {

	public static void main(String[] args) {
		String[] genres = { "jazz", "classic", "pop", "classic", "classic", "pop" };
		int[] plays = { 600, 500, 600, 150, 800, 2500 };
		System.out.println(solution(genres, plays));
	}

	public static int[] solution(String[] genres, int[] plays) {
		int[] answer = {};
		Map<String, Integer> music = new HashMap<>();
		List<Integer> album = new ArrayList<>();

		for (int i = 0, len = genres.length; i < len; i++)
			music.put(genres[i], music.getOrDefault(genres[i], 0) + plays[i]);

		System.out.println(music);
		return answer;
	}
}
