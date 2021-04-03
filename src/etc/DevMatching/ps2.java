package etc.DevMatching;

import java.util.Arrays;

public class ps2 {

	public static void main(String[] args) {
		int row1 = 6, row2 = 3, row3 = 100;
		int column1 = 6, column2 = 3, column3 = 97;
		int[][] queries1 = { { 2, 2, 5, 4 }, { 3, 3, 6, 6 }, { 5, 1, 6, 3 } },
				queries2 = { { 1, 1, 2, 2 }, { 1, 2, 2, 3 }, { 2, 1, 3, 2 }, { 2, 2, 3, 3 } },
				queries3 = { { 1, 1, 100, 97 } };

		solution(row1, column1, queries1);
//		solution(row2, column2, queries2);
//		solution(row3, column3, queries3);

	}

	public static int[] solution(int rows, int columns, int[][] queries) {
		int[] answer = new int[queries.length];

		int[][] arr = new int[rows][columns];

		int num = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				num++;
				arr[i][j] = num;
			}
		}

		for (int i = 0; i < queries.length; i++) {
			answer[i] = change(arr, queries[i]);
		}

		return answer;
	}

	private static int change(int[][] arr, int[] query) {

		int min = arr[arr.length - 1][arr[0].length - 1];

		for (int i = 0; i < query.length; i++)
			query[i]--;
//		System.out.println(Arrays.toString(query));

		int tempC = arr[query[0]][query[1]];
		int tempN = arr[query[0]][query[1]];

		for (int i = query[0]; i < query[3]; i++) { // 첫 가로줄
			tempC = arr[query[0]][i + 1];
			System.out.println(tempC);
			arr[query[0]][i + 1] = arr[query[0]][i];
		}

		System.out.println(Arrays.toString(arr[1]));

		return 0;
	}

}
