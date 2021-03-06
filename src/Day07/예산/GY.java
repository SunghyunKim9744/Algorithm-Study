package Day07.예산;

import java.util.Arrays;

public class GY {
	public static void main(String[] args) {
		int d1[] = { 1, 3, 2, 5, 4 };
		int budget1 = 9;
		System.out.println(solution(d1, budget1));

		int d2[] = { 2, 2, 3, 3 };
		int budget2 = 10;
		System.out.println(solution(d2, budget2));
	}

	// 0.40 ~ 2.29ms
	public static int solution(int[] d, int budget) {
		int answer = 0;

		Arrays.sort(d);

		for (int i : d) {
			budget -= i;
			if (budget >= 0) {
				answer++;
			} else {
				break;
			}
		}

		return answer;
	}

}
