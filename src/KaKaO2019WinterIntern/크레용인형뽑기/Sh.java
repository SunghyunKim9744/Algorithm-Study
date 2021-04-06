package KaKaO2019WinterIntern.크레용인형뽑기;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Sh {

	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		int answer = solution(board,moves);
		System.out.println(answer);

	}

	// 1:54
	private static int solution(int[][] board, int[] moves) {
		int answer = 0;
		List<Deque<Integer>> boardList = new ArrayList<>();
		Deque<Integer> answerStack = new LinkedList<>();
		
		for(int i=0; i<board.length; i++) {
			Deque<Integer> lineStack = new LinkedList<>();
			for(int j=0; j<board.length; j++) {
				if(board[j][i] != 0)
					lineStack.offerLast(board[j][i]);
			}
			
			boardList.add(lineStack);
		}
		
		for(Integer i : moves) {
			Deque<Integer> tempLine = boardList.get(i-1);
			
			if(tempLine.isEmpty())
				continue;
			int doll = tempLine.pollFirst();
			if(answerStack.isEmpty())
				answerStack.offerFirst(doll);
			else {
				int temp = answerStack.peek();
				if(doll == temp) {
					answer+=2;
					answerStack.pollFirst();
				}
				else {
					answerStack.offerFirst(doll);
				}
					
			}
		}
		return answer;
	}

}
