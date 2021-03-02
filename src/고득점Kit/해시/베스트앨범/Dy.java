package 고득점Kit.해시.베스트앨범;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

// 11:52 ~ 12:52
public class Dy {

	public static void main(String[] args) {
		String[] genres = { "classic", "pop", "classic", "classic", "pop" };
		int[] plays = { 500, 600, 150, 800, 2500 };
		System.out.println(solution(genres, plays));
	}
// 테스트 3 〉	통과 (0.46ms, 52.6MB) 테스트 8 〉	통과 (0.90ms, 52.8MB)
	public static int[] solution(String[] genres, int[] plays) {
		int[] answer = {};
		Map<String, Integer> play = new HashMap<String, Integer>();
		Map<String, Integer> one = new HashMap<String, Integer>();
		Map<String, Integer> two = new HashMap<String, Integer>();
		for(int i = 0 ; i<genres.length; i++) {
			play.put(genres[i], play.getOrDefault(genres[i], 0) +plays[i]);
			if(one.get(genres[i]) != null) {
				if(plays[one.get(genres[i])] < plays[i]) {
					two.put(genres[i], one.get(genres[i]));
					one.put(genres[i],i);
				}else if(two.get(genres[i]) != null) {
					if(plays[two.get(genres[i])] < plays[i]) {
						two.put(genres[i],i);
					}
				}else {
					two.put(genres[i],i);
				}
			}else {
				one.put(genres[i],i);
			}
		}
		
		List<Entry<String, Integer>> entryList = new ArrayList<Map.Entry<String,Integer>>(play.entrySet());
		
		Collections.sort(entryList, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		
		List<Integer> ansList = new ArrayList<Integer>();
		
		for(Entry<String, Integer> entry: entryList) {
			if(one.get(entry.getKey()) != null) {
				ansList.add(one.get(entry.getKey()));
			}
			if(two.get(entry.getKey()) != null) {
				ansList.add(two.get(entry.getKey()));
			}
		}
		answer = new int[ansList.size()];
		for(int i=0; i<ansList.size(); i++) {
			answer[i] = ansList.get(i);
		}
		
		return answer;
	}
}
