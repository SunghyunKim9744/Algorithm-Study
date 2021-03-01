package Day05.크레인인형뽑기게임;

import java.util.Stack;

public class HJ {
	public static void main(String[] args) {
		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 }; // 4, (3, (1, 1), 3), 2, 0, 4
		System.out.println(solution(board, moves));
	}

	public static int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();

		for (int i = 0, len = moves.length; i < len; i++) {
			int track = moves[i] - 1;

			for (int j = 0, size = board.length; j < size; j++) {
				if (board[j][track] == 0)
					continue;

				int doll = board[j][track];

				if (!stack.isEmpty() && stack.peek() == doll) {
					stack.pop();
					answer += 2;
				} else
					stack.add(doll);

				board[j][track] = 0;
				break;
			}
		}

		return answer;
	}
}
