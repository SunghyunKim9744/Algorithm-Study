package 고득점Kit.Greedy.섬연결하기;

import java.util.Arrays;

public class Sh {

	public static void main(String[] args) {

		int n = 4;
		int[][] costs = { { 0, 1, 1 }, { 0, 2, 2 }, { 1, 2, 5 }, { 1, 3, 1 }, { 2, 3, 8 } };

		System.out.println(solution(n, costs));
	}

	// 11:16 ~
	private static int solution(int n, int[][] costs) {
		int answer = 0;

		for (int i = 0; i < costs.length - 1; i++) {
			for (int j = i + 1; j < costs.length; j++) {
				if (costs[i][0] > costs[j][0]) {
					int[] temp = costs[i];
					costs[i] = costs[j];
					costs[j] = temp;
				} else if (costs[i][0] == costs[i][0]) {
					if (costs[i][1] > costs[i][1]) {
						int[] temp = costs[i];
						costs[i] = costs[j];
						costs[j] = temp;
					}
				}
			}
		}
		return answer;
	}

}
