package Day05.크레인인형뽑기게임;

import java.util.Stack;

public class GY {

	public static void main(String[] args) {
		int[][] board = { { 0, 0, 0, 0, 0 }, 
						  { 0, 0, 1, 0, 3 }, 
						  { 0, 2, 5, 0, 1 }, 
						  { 4, 2, 4, 4, 2 },
						  { 3, 5, 1, 3, 1 } };
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
		System.out.println(solution(board, moves));
	}

	public static int solution(int[][] board, int[] moves) {
		int answer = 0;
		
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < moves.length; i++) {
			
			int move = moves[i] - 1;
			for (int j = 0; j < board[0].length; j++) {
				
				if (board[j][move] != 0) {
					
					boolean done = false;
					// 스택에 같은 값이 있으면 push하지 않고 바로 삭제
					if (!stack.isEmpty() && stack.peek() == board[j][move]) {
						stack.pop();
						answer += 2;
						done = true;
						board[j][move] = 0;
					}
					// 삭제된 경우 반복문 빠져나가기
					if (done)
						break;
					// 삭제할 값이 없는 경우 push
					stack.push(board[j][move]);
					board[j][move] = 0;
					break;
				}
			}
		}

		return answer;
	}
}
