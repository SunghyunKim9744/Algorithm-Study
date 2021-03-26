package Level2And3Day1.가장큰정사각형;

public class Dy {

	public static void main(String[] args) {
		
		int[][] board = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
		int[][] board2 = {{0,0,1,1},{1,1,1,1}};
		
//		System.out.println(solution(board));
		System.out.println(solution(board2));

	}

	private static int solution(int[][] board) {
		int answer = 0;
		int[] start = new int[2];
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[0].length; j++) {
				start[0] = i;
				start[1] = j;
				if(answer < code(board, start)) {
					answer = code(board, start);
				}
			}
		}
		return answer;
	}
	private static int code(int[][] board, int[] start) {
		int answer = 0;
        int max = board.length;
        
		for(int i=start[0]; i<max; i++) {
			for(int j=start[1]; j<max; j++) {
				if(board[i][j] != 1) {
					max = j;
				}
			}
		}
        answer = max * max;
		return answer;
	}
}
