package Day07.예산;

import java.util.Arrays;

public class HJ {
	public static void main(String[] args) {
		int d[] = { 1, 3, 2, 5, 4 };
		int budget = 9;
		System.out.println(solution(d, budget));
	}

	// (0.39ms, 52.9MB) - (0.53ms, 52.6MB)
	public static int solution(int[] d, int budget) {
		int answer = 0;

		Arrays.sort(d);

		for (int i = 0, len = d.length; i < len; i++) {
			if (budget - d[i] < 0)
				break;

			budget -= d[i];
			answer++;
		}

		return answer;
	}
}
