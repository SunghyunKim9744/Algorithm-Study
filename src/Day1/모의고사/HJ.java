package Day1.모의고사;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HJ {

	public static void main(String[] args) {
		int[] answers = { 1, 2, 3, 4, 5, 1, 3, 4, 5, 5 };
		System.out.println(solution(answers));
	}

	public static int[] solution(int[] answers) {
		int[] answer = { 0, 0, 0 };
		int[] p1 = { 1, 2, 3, 4, 5 };
		int[] p2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] p3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		// 값 계산
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == p1[i % p1.length])
				answer[0]++;

			if (answers[i] == p2[i % p2.length])
				answer[1]++;

			if (answers[i] == p3[i % p3.length])
				answer[2]++;
		}

		// 정렬
		List<Map<Integer, Integer>> list = new ArrayList<>();
		for (int i = 0; i < answer.length; i++) {
			if (answer[i] == 0)
				continue;

			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			map.put(i + 1, answer[i]);
			list.add(map);
		}

		for (int i = 0; i < list.size(); i++)
			for (int j = 0; j < list.size() - 1 - i; j++) {
				
			}
		
		return answer;
	}

}