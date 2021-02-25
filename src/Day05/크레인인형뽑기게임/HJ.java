package Day05.크레인인형뽑기게임;

import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;

public class HJ {
	public static void main(String[] args) {
		int[][] board = { { 0, 0, 3, 3, 3 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };
		int[] moves = { 5, 5, 1, 1, 4 };// 1, 5, 3, 5, 1, 2, 1 };
		System.out.println(solution(board, moves));
	}

	// 정확성 : 0점...ㅠ^ㅠ
	public static int solution(int[][] board, int[] moves) {
		int answer = 0;
		List<Integer> stack = new LinkedList<>();
		int[] indexes = new int[board.length];
		Arrays.fill(indexes, board.length - 1);

		for (int i = 0; i < moves.length; i++) {
			int section = moves[i] - 1;
			int item = indexes[section]--;
			int doll;

			// 해당 섹션에 더 이상 인형 없을 때
			if (item < 0)
				continue;

			doll = board[section][item];

			// 인형이 없을 때
			if (doll == 0)
				continue;

			if (stack.size() > 0 && stack.get(stack.size() - 1) == doll) {
				stack.remove(stack.size() - 1);
				answer += 2;

			} else
				stack.add(doll);
		}

		return answer;
	}
}
