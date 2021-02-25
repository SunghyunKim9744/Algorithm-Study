package Day05.크레인인형뽑기게임;

import java.util.ArrayList;
import java.util.List;

public class Dy {

	 public int solution(int[][] board, int[] moves) {
	        int answer = 0;
	        List<Integer> list = new ArrayList<Integer>();
	        for(int key: moves) {
	        	for(int i = 0; i<board.length; i++) {
	        		if(board[i][key-1] != 0) {
	        			list.add(board[i][key-1]);
	        			board[i][key-1] = 0;
	            		break;
	            	}
	        	}
	        	
	        	for(int i = 0; i<list.size()-1; i++) {
	        		if(list.get(i) == list.get(i+1)) {
	        			list.remove(i);
	        			list.remove(i);
	        			answer += 2;
	        			break;
	        		}
	        	}
	        }
	        return answer;
	    }
}
