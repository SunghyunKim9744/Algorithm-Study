package D_1017.백준_2151_거울설치;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


/*
 * 
 * 
 * 	https://www.acmicpc.net/problem/2151
 * 
 */
public class Dy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(Dy.class.getResourceAsStream("input.txt"));
		
		int N = Integer.parseInt(sc.nextLine());
		
		String[][] board = new String[N][N];
		
		int[][] point = new int[2][2];
		int point2 = 0;
		Set<String> set = new HashSet<>();
		int direction = 0;
		for(int i=0; i<N; i++) {
			board[i] = sc.nextLine().split("");
			for(int j=0; j<N; j++) {
				if(board[i][j].equals("#")) {
					point[point2][0] = i;
					point[point2][1] = j;
					point2++;
					if(point2 == 0) {
						if(i == 0) {
							direction = 1;
						}
						if(j == 0) {
							direction = 3;
						}
						if(j == N - 1) {
							direction = 2;
						}
					}
				}
				if(board[i][j].equals("!")) {
					StringBuilder sb = new StringBuilder();
					sb.append(i);
					sb.append(",");
					sb.append(j);
					set.add(sb.toString());
				}
			}
		}
		
		solution(board, point[0][1], point[0][0], point[1][1], point[1][0], set, 0);
		
	}

	private static int solution(String[][] board, int x1, int y1, int x2, int y2, int direction, Set<String> set, int cnt) {
		int answer = 9999999;
		
		int temp = 0;
		
		if(direction == 0 && x1 > 0) {
			temp = solution(board, x1, y1, x2, y2, direction, set, cnt);
		}
		
		
		
		
		
		return answer;
	}
}
