package Day05.행렬의덧셈;

public class Sh {

	public static void main(String[] args) {
		int[][] arr1 = { { 1, 2 }, { 2, 3 } };
		int[][] arr2 = { { 3, 4 }, { 5, 6 } };

		int[][] answer = solution(arr1, arr2);
	}

	// (0.02ms, 52MB) - > (6.55ms, 101MB)
//	private static int[][] solution(int[][] arr1, int[][] arr2) {
//
//		int column = arr1.length;
//		int row = arr1[0].length;
//
//		int[][] answer = new int[column][row];
//
//		for (int i = 0; i < column; i++)
//			for (int j = 0; j < row; j++)
//				answer[i][j] = arr1[i][j] + arr2[i][j];
//		return answer;
//	}

	// 통과 (0.02ms, 52.7MB) - > (5.66ms, 100MB)
	private static int[][] solution(int[][] arr1, int[][] arr2) {

		int[][] answer = arr1;

		for (int i = 0; i < answer.length; i++)
			for (int j = 0; j < answer[i].length; j++)
				answer[i][j] += arr2[i][j];
		return answer;
	}

}
