package KaKaO2019WinterIntern.크레용인형뽑기;

import java.util.Stack;

public class Dy {

	public static void main(String[] args) {
		
		int[][] c = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] m = {1,5,3,5,1,2,1,4};
		
		System.out.println(solution(c,m));

	}

	private static int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<Integer>();
        
        for(Integer key: moves) {
	        for(int i = 0; i<board.length; i++) {
	        	if(board[i][key-1] != 0) {
	        		if(!stack.isEmpty() && stack.peek() == board[i][key-1]) {
	        			stack.pop();
	        			answer += 2;
	        		}else {
		        		stack.push(board[i][key-1]);
	        		}
	        		board[i][key-1] = 0;
	        		break;
	        	}
	        }
        }
        
        return answer;
    }

}
