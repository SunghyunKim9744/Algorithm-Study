package Level2And3Day1.가장큰정사각형;

public class Dy {

	public static void main(String[] args) {
		
		int[][] board = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
		
		System.out.println(solution(board));

	}

	private static int solution(int[][] board) {
		int answer = 0;
		int[] start = new int[2];
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[0].length; j++) {
				start[0] = i;
				start[1] = j;
				System.out.println("힌반");
				if(answer < code(board, start)) {
					answer = code(board, start);
				}
			}
		}
		return answer;
	}
	private static int code(int[][] board, int[] start) {
		int answer = 0;
		
		for(int i=start[0]; i<board.length; i++) {
			for(int j=start[1]; j<board[0].length-start[0]; j++) {
				if(board[i][j] != 1) {
					return answer;
				}
			}
			answer = (i-start[0]+1)*(i-start[0]+1);
		}
		return answer;
	}
}
