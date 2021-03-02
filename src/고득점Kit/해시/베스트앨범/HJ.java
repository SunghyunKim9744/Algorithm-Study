package 고득점Kit.해시.베스트앨범;

import java.util.*;

public class HJ {

	public static void main(String[] args) {
		String[] genres = { "classic", "pop", "classic", "classic", "pop" };
		int[] plays = { 500, 600, 150, 800, 2500 };
		System.out.println(Arrays.toString(solution(genres, plays)));
	}

	public static int[] solution(String[] genres, int[] plays) {
		int[] answer = {};
		Map<String, Integer> music = new HashMap<>();
		List<Integer> album = new ArrayList<>();

		// 장르별 재생 구하기
		for (int i = 0, len = genres.length; i < len; i++)
			music.put(genres[i], music.getOrDefault(genres[i], 0) + plays[i]);

		// 최대 재생 장르
		List<String> musicList = new LinkedList<String>(music.keySet());
		musicList.sort((k1, k2) -> music.get(k2).compareTo(music.get(k1)));

		// 앨범 곡 구하기
		for (int i = 0, size = musicList.size(); i < size; i++) {
			String genre = musicList.get(i);
			List<Integer> temp = new ArrayList<>();

			// 장르별 곡 선정
			for (int j = 0, len = genres.length; j < len; j++)
				if (genres[j].equals(genre))
					temp.add(j);

			// 곡 기준 내림차순 정렬
			temp.sort((m1, m2) -> {
				if (m1 == m2)
					return m1.compareTo(m2);
				else
					return plays[m2] - plays[m1];
			});

			int max = temp.size() < 2 ? temp.size() : 2;

			// 곡 선정
			for (int j = 0; j < max; j++)
				album.add(temp.get(j));
		}

		answer = album.stream().mapToInt(i -> i).toArray();

		return answer;
	}
}
