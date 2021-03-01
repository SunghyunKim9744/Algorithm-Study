package 고득점Kit.완전탐색.카펫;

import java.util.LinkedList;
import java.util.List;

public class GY {

	public static void main(String[] args) {

		int brown1 = 10, yellow1 = 2;
		int brown2 = 8, yellow2 = 1;
		int brown3 = 24, yellow3 = 24;

		solution(brown1, yellow1);
		solution(brown2, yellow2);
		solution(brown3, yellow3);

	}

	// 2:54 ~ 3:07
	// 0.10 ~ 16.03ms
	// 가로>=세로
	public static int[] solution(int brown, int yellow) {
		int[] answer = {};

		int row = 0, column = 0;
		int sum = brown + yellow;

		// yellow의 약수 찾기
		List<Integer> yellowDivisors = new LinkedList<>();
		for (int i = 1; i <= yellow; i++) {
			if (yellow % i == 0)
				yellowDivisors.add(i);
		}

		for (int i = 0; i < yellowDivisors.size(); i++) {
			row = yellowDivisors.get(i) + 2;
			column = yellow / yellowDivisors.get(i) + 2;
			if (row * column == sum)
				break;
		}

		if (row < column) {
			int temp = row;
			row = column;
			column = temp;
		}

		answer = new int[] { row, column };
		return answer;
	}

	// 0.01 ~ 0.06
//	public static int[] solution(int brown, int yellow) {
//		int[] answer = new int[2];
//
//		int x = 0;
//		int y = 0;
//
//		for (y = 3; y <= brown + yellow; y++) {
//			x = (brown + yellow) / y;
//			if (yellow == (x - 2) * (y - 2)) {
//				answer[0] = x;
//				answer[1] = y;
//				if (x < y) {
//					int temp = x;
//					x = y;
//					y = x;
//				}
//				System.out.println(x + " " + y);
//				break;
//			}
//		}
//
//		return answer;
//	}

}
