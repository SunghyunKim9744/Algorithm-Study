package Day07.실패율;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HJ {

	public static void main(String[] args) {
		int N = 4;
		int[] stages = { 4, 4, 4, 4, 4 };
		System.out.println(Arrays.toString(solution(N, stages)));
	}

	// 방법 1) 실패: (0.02ms, 52.3MB) - (368.08ms, 61.8MB)
	public static int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		Map<Integer, Double> failure = new HashMap<>();

		// 실패율
		for (int i = 0; i < N; i++) {
			int notCleared = 0;
			int cleared = 0;

			for (int j = 0, len = stages.length; j < len; j++) {
				if ((i + 1) == stages[j])
					notCleared++;
				if ((i + 1) <= stages[j])
					cleared++;
			}

			if (cleared == 0)
				failure.put(i + 1, 0.0);
			else
				failure.put(i + 1, (double) notCleared / cleared);
		}

		// 정렬
		List<Map.Entry<Integer, Double>> list = new LinkedList<>(failure.entrySet());
		list.sort((e1, e2) -> {
			if (e1.getValue() == e2.getValue())
				return e1.getKey() > e2.getKey() ? 1 : -1;
			else
				return e2.getValue().compareTo(e1.getValue());
		});

		// 답
		for (int i = 0; i < N; i++)
			answer[i] = list.get(i).getKey();

		return answer;
	}

}
