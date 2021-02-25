package Day05.크레인인형뽑기게임;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
	// 방법 2. 넣을 때 제거 (인형 제거 X)
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
	// 방법 3. 스택 이용 (인형 제거 X)
//	public static int solution(int[][] board, int[] moves) {
//		int answer = 0;
//
//		Deque<Integer> stack = new ArrayDeque<>();
//
//		for (int i = 0; i < moves.length; i++) {
//			int index = moves[i] - 1;
//			for (int j = 0; j < board.length; j++) {
//				if (board[j][index] != 0) {
//					if (!stack.isEmpty() && stack.peekFirst() == board[j][index]) {
//						stack.pollFirst();
//						answer += 2;
//					} else
//						stack.offerFirst(board[j][index]);
//					board[j][index] = 0;
//					break;
//				}
//			}
//		}
//		return answer;
//	}
	
	// (0.09ms, 52MB) - > (1.81ms, 52.4MB)
	// 스택(큐 같은 스택)만 이용 (인형 제거O)
//	public static int solution(int[][] board, int[] moves) {
//		int answer = 0;
//
//		List<Deque<Integer>> stackList = new ArrayList<>();
//		for(int i=0; i<board.length; i++) {
//			Deque<Integer> temp = new ArrayDeque<>();
//			for(int j=0; j<board.length; j++) {
//				if(board[j][i] != 0)
//					temp.offerFirst(board[j][i]);
//			}
//			stackList.add(temp);
//		}
//
//		
//		Deque<Integer> stack = new ArrayDeque<>();
//		for (int i = 0; i < moves.length; i++) {
//			int index = moves[i]-1;
//			if(stackList.get(index).peekLast() == null)
//				break;
//			int get = stackList.get(index).pollLast();
//			if( !stack.isEmpty() && get == stack.peekFirst()) {
//				stack.pollFirst();
//				answer+=2;
//			}
//			else
//				stack.offerFirst(get);
//				
//		}
//		return answer;
//	}
	
	// (0.21ms, 51.8MB) - > (2.39ms, 52.7MB)
	// 큐 + 스택(인형 제거 O)
	public static int solution(int[][] board, int[] moves) {
		int answer = 0;

		List<Queue<Integer>> queueList = new ArrayList<>();
		for(int i=0; i<board.length; i++) {
			Queue<Integer> temp = new LinkedList<>();
			for(int j=0; j<board.length; j++) {
				if(board[j][i] != 0)
					temp.offer(board[j][i]);
			}
			queueList.add(temp);
		}

		
		Deque<Integer> stack = new ArrayDeque<>();
		for (int i = 0; i < moves.length; i++) {
			int index = moves[i]-1;
			if(queueList.get(index).peek() == null)
				break;
			int get = queueList.get(index).poll();
			if( !stack.isEmpty() && get == stack.peekFirst()) {
				stack.pollFirst();
				answer+=2;
			}
				
			
			else 
				stack.offerFirst(get);
			
			
				
				
		}
		return answer;
	}


}
