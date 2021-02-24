package Day01.모의고사;

import java.util.ArrayList;
import java.util.List;

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

		// 최고값 구하기
		int max = Math.max(answer[0], Math.max(answer[1], answer[2]));

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < answer.length; i++)
			if (max == answer[i])
				list.add(i + 1);

		return list.stream().mapToInt(i -> i).toArray();
	}

}