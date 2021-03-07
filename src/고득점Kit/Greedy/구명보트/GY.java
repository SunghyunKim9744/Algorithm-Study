package 고득점Kit.Greedy.구명보트;

import java.util.Arrays;

public class GY {

	public static void main(String[] args) {

		int[] people1 = { 70, 50, 80, 50 }, people2 = { 70, 80, 50 };

		int limit1 = 100, limit2 = 100;

		System.out.println(solution(people1, limit1));
		System.out.println(solution(people2, limit2));

	}

	// 9:57 ~ 10:25
	// 1.19ms ~ 1.88ms
	// 7.52ms ~ 10.73ms
	private static int solution(int[] people, int limit) {
		int answer = 0;

		Arrays.sort(people);

		int i = 0;
		for (int k = people.length - 1; k >= i; k--) {
			if (people[i] + people[k] <= limit) {
				i++;
				answer++;
			} else {
				answer++;
			}
		}

		return answer;
	}

}