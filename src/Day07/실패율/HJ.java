package Day07.실패율;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HJ {
	/*
	 * 실패율 = 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
	 */

	public static void main(String[] args) {
		int N = 5;
		int[] stages = { 2, 1, 2, 6, 2, 4, 3, 3 };
		System.out.println(Arrays.toString(solution(N, stages)));
	}

	// 방법 1) 실패: (0.02ms, 52.3MB) - (368.08ms, 61.8MB)
	public static int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		Map<Integer, Double> failure = new HashMap<>();

		// 스테이지 초기화
		for (int i = 0; i < N; i++)
			failure.put(i + 1, 0.0);

		// 실패율
		for (Integer key : failure.keySet()) {
			int count = 0;
			for (int i = 0, len = stages.length; i < len; i++) {
				if (key == stages[i])
					failure.replace(key, failure.get(key) + 1);

				if (key <= stages[i])
					count++;
			}

			if (count == 0)
				continue;
			else
				failure.replace(key, failure.get(key) / count);
		}
		
		System.out.println(failure);

		// 정렬
		List<Map<Integer, Double>> failureList = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			Map<Integer, Double> map = new HashMap<>();
			map.put(i + 1, failure.get(i + 1));
			failureList.add(map);
		}

		// 1 : 0 ,
		// 2 : 0.5 ,
		// 3 : 0
		failureList.sort((m1, m2) -> {
			Integer key1 = null;
			Integer key2 = null;

			for (Integer key : failure.keySet()) {
				if (m1.containsKey(key))
					key1 = key;
				else if (m2.containsKey(key))
					key2 = key;
			}

			if (m1.get(key1) == m2.get(key2))
				return (key1 > key2) ? key1 - key2 : key2 - key1;
			else if (m1.get(key1) > m2.get(key2))
				return (key1 > key2) ? key2 - key1 : key1 - key2;
			else
				return (key1 > key2) ? key1 - key2 : key2 - key1;
		});
		
		System.out.println(failureList);

		for (int i = 0, size = failureList.size(); i < size; i++) {
			Integer index = null;
			for (Integer key : failure.keySet())
				if (failureList.get(i).containsKey(key))
					index = key;

			answer[i] = index;
		}

		// 실패율 내림차순
		return answer;
	}

}
