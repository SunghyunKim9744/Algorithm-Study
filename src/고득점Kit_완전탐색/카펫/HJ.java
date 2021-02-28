package 고득점Kit_완전탐색.카펫;

import java.util.Arrays;

public class HJ {
	public static void main(String[] args) {
		int brown = 12;
		int yellow = 3;
		long start = System.currentTimeMillis();
		System.out.println(Arrays.toString(solution(brown, yellow)));
		long end = System.currentTimeMillis();
		System.out.printf("end : %d\n", end);
		System.out.printf("start : %d\n", start);
		System.out.printf("Time : %d\n", end - start);
	}

	public static int[] solution(int brown, int yellow) {
		int[] answer = new int[2];

		for (int i = 0; 0 < yellow; i++) {
			System.out.println(yellow);
			int bBlock = yellow * 2 + ((int) Math.pow(2, i) + 2) * 2;

			if (bBlock == brown) {
				int row = yellow + 2;
				int col = (int) Math.pow(2, i) + 2;

				answer[0] = (row >= col) ? row : col;
				answer[1] = (row >= col) ? col : row;

				break;
			}

			yellow /= 2;
		}
		
		return answer;
	}
}
