package Day05.크레인인형뽑기게임;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Sh {

	public static void main(String[] args) {

		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };

		int answer = solution(board, moves);
	}

	// 11:31 ~ 12:08
	// (0.06ms, 53.2MB) - > (3.57ms, 52.7MB)
//	public static int solution(int[][] board, int[] moves) {
//        int answer = 0;
//        
//        List<Integer> baguni = new ArrayList<>();
//        for(int i=0; i<moves.length; i++) {
//        	int index = moves[i]-1;
//        	for(int j=0; j<board.length; j++) {
//        		if(board[j][index] != 0) {
//        			baguni.add(board[j][index]);
//        			board[j][index] = 0;
//        			break;
//        		}
//        	}
//        }
//         
//        for(int i=0; i<baguni.size()-1; i++) {
//        	if(baguni.get(i) == baguni.get(i+1)) {
//        		answer+=2;
//        		baguni.remove(i);
//        		baguni.remove(i);
//        		i=-1;	// 이 부분에서 시간이 많이 걸림.
//        	}
//        	
//        	
//        }
//       
//        return answer;
//    }

	// (0.06ms, 52.1MB) - > (0.77ms, 52.6MB)
	// 방법 2. 넣을 때 제거
//	public static int solution(int[][] board, int[] moves) {
//        int answer = 0;
//        
//        List<Integer> baguni = new LinkedList<>();
//        for(int i=0; i<moves.length; i++) {
//        	int index = moves[i]-1;
//        	for(int j=0; j<board.length; j++) {
//        		if(board[j][index] != 0) {
//        			if(baguni.size() != 0 && baguni.get(baguni.size()-1) == board[j][index]) {
//        				baguni.remove(baguni.size()-1);
//        				answer+=2;
//        			}
//        			else
//        				baguni.add(board[j][index]);
//        			board[j][index] = 0;
//        			break;
//        		}
//        	}
//        }
//       
//        return answer;
//    }

	// (0.06ms, 51.7MB) - > (1.19ms, 52.1MB)
	// 방법 3. 스택 이용
	public static int solution(int[][] board, int[] moves) {
		int answer = 0;

		Deque<Integer> stack = new ArrayDeque<>();

		for (int i = 0; i < moves.length; i++) {
			int index = moves[i] - 1;
			for (int j = 0; j < board.length; j++) {
				if (board[j][index] != 0) {
					if (!stack.isEmpty() && stack.peekFirst() == board[j][index]) {
						stack.pollFirst();
						answer += 2;
					} else
						stack.offerFirst(board[j][index]);
					board[j][index] = 0;
					break;
				}
			}
		}
		return answer;
	}


}
