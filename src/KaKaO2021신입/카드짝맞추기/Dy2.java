package KaKaO2021신입.카드짝맞추기;

public class Dy2 {

	public static void main(String[] args) {
		int[][] b = { { 1, 0, 0, 3 }, { 2, 0, 0, 0 }, { 0, 0, 0, 2 }, { 3, 0, 1, 0 } };
		int r = 1;
		int c = 0;
		solution(b, r, c);
	}

	public static int solution(int[][] board, int r, int c) {
		int answer = 0;

		boolean clicked = false;
		int card = 0;
		int remain = 0;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (board[i][j] != 0) {
					remain++;
				}
			}
		}
		answer += remain;
		if (board[r][c] != 0) {
			card = board[r][c];
			board[r][c] = 0;
			remain--;
			clicked = true;
		}

		answer += comb(board, r, c, clicked, card, 0, remain);
		System.out.println(answer);
		return answer;
	}

	public static int comb(int[][] board, int x, int y, boolean clicked, int card, int count, int remain) {
		int answer = 10000000;
		if (remain == 0) {
			return count;
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (clicked) {
					if (board[i][j] == card && board[i][j] != 0) {
						int tempCard = board[i][j];
						board[i][j] = 0;
						int cnt = min(board,x,y,i,j,0,0);
						System.out.println("re"+remain+"cnt"+cnt+":"+i+":"+j);
						int temp = comb(board, i, j, false, 0, count+cnt, remain-1);
						if (temp != 10000000 && temp < answer) {
							answer = temp;
						}
						board[i][j] = tempCard;
					}
				} else {
					if (board[i][j] != 0) {
						int tempCard = board[i][j];
						board[i][j] = 0;
						int cnt = min(board,x,y,i,j,0,0);
						System.out.println("re"+remain+"cnt"+cnt+":"+i+":"+j);
						int temp = comb(board, i, j, true, tempCard, count+cnt, remain-1);
						if (temp != 10000000 && temp < answer) {
							answer = temp;
						}
						board[i][j] = tempCard;
					}
				}
			}
		}
		return answer;
	}

	private static int min(int[][] board, int x1, int y1, int x2, int y2, int length, int level) {
		int answer = 10000000;
		if(x1 == x2 && y1 == y2) {
			return length;
		}
		if(x1 != x2) {
			if(x1 < x2) {
				if(level == 1) {
					int temp = min(board, x1+1, y1, x2, y2, length, 1);
					if(answer > temp) {
						answer = temp;
					}
				}else {
					int temp = min(board, x1+1, y1, x2, y2, length+1, 1);
					if(answer > temp) {
						answer = temp;
					}
				}
			}else {
				if(level == 1) {
					int temp = min(board, x1, y1, x2+1, y2, length, 1);
					if(answer > temp) {
						answer = temp;
					}
				}else {
					int temp = min(board, x1, y1, x2+1, y2, length+1, 1);
					if(answer > temp) {
						answer = temp;
					}
				}
			}
		}
		
		if(y1 != y2) {
			if(y1 < y2) {
				if(level == 2) {
					int temp = min(board, x1, y1+1, x2, y2, length, 2);
					if(answer > temp) {
						answer = temp;
					}
				}else {
					int temp = min(board, x1, y1+1, x2, y2, length+1, 2);
					if(answer > temp) {
						answer = temp;
					}
				}
			}else {
				if(level == 2) {
					int temp = min(board, x1, y1, x2, y2+1, length, 2);
					if(answer > temp) {
						answer = temp;
					}
				}else {
					int temp = min(board, x1, y1, x2, y2+1, length+1, 2);
					if(answer > temp) {
						answer = temp;
					}
				}
			}
		}
		
		return answer;
	}

}
