package Day07.실패율;

import java.util.Arrays;

public class HJ {
	/*
	 * 실패율 = 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
	 */

	public static void main(String[] args) {
		int N = 5;
		int[] stages = { 2, 1, 2, 1, 2, 4, 3, 3 };
		System.out.println(Arrays.toString(solution(N, stages)));
	}

	// 방법 1) 실패: (0.02ms, 52.3MB) - (368.08ms, 61.8MB)
	public static int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		double[] failure = new double[N];

		// answer 초기화
		for (int i = 0; i < N; i++)
			answer[i] = i + 1;

		// 실패율 계산
		for (int i = 0; i < N; i++) {
			int count = 0;
			for (int j = 0, people = stages.length; j < people; j++) {
				if (i + 1 == stages[j])
					failure[i]++;

				if (i + 1 <= stages[j])
					count++;
			}

			if (count == 0)
				failure[i] = 0;
			else
				failure[i] /= count;
		}

		System.out.println(Arrays.toString(failure));

		// 선택 정렬 내림차순
		for (int i = 0; i < N - 1; i++) {
			int max = i;

			for (int j = i + 1; j < N; j++)
				if (failure[max] < failure[j])
					max = j;

			int tempA = answer[i];
			answer[i] = answer[max];
			answer[max] = tempA;

			double tempF = failure[i];
			failure[i] = failure[max];
			failure[max] = tempF;
		}

		for (int i = 0; i < N - 1; i++) {
			int max = i;

			for (int j = i + 1; j < N; j++)
				if (failure[max] == failure[j])
					max = j;

			if (answer[i] > answer[max]) {
				int tempA = answer[i];
				answer[i] = answer[max];
				answer[max] = tempA;

				double tempF = failure[i];
				failure[i] = failure[max];
				failure[max] = tempF;
			}
		}

		// 실패율 내림차순
		return answer;
	}

//	public static int[] solution(int N, int[] stages) {
//        int[] answer = {};
//        
//        return answer;
//    }
}
