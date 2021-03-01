package 고득점Kit.완전탐색.카펫;

import java.util.Arrays;

public class HJ {
	public static void main(String[] args) {
		int brown = 28;
		int yellow = 27;
		long start = System.currentTimeMillis();
		System.out.println(Arrays.toString(solution(brown, yellow)));
		long end = System.currentTimeMillis();
		System.out.printf("end : %d\n", end);
		System.out.printf("start : %d\n", start);
		System.out.printf("Time : %d\n", end - start);
	}

	public static int[] solution(int brown, int yellow) {
		int[] answer = new int[2];

		for (int i = yellow; i > 0; i--) {
			if (yellow % i != 0)
				continue;

			int j = yellow / i;
			int bBlock = i * 2 + j * 2 + 4;

			if (bBlock == brown) {
				answer[0] = ((i + 2) > (j + 2)) ? i + 2 : j + 2;
				answer[1] = ((i + 2) > (j + 2)) ? j + 2 : i + 2;
				break;
			}
		}

		return answer;
	}
}
