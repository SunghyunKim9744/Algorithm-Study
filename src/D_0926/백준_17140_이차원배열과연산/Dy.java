package D_0926.백준_17140_이차원배열과연산;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] temp = sc.nextLine().split(" ");
		int[][] board = new int[3][3];
		for(int i = 0; i<3; i++) {
			String[] temp2 = sc.nextLine().split(" ");
			for(int j=0; j<3; j++) {
				board[i][j] = Integer.parseInt(temp2[j]);
			}
		}
		
		int r = Integer.parseInt(temp[0]);
		int c = Integer.parseInt(temp[1]);
		int k = Integer.parseInt(temp[2]);
		
		int line = 3;
		int row = 3;
		Map<Integer, Integer> map = new HashMap<>();
		while(board[r][c] != k) {
			if(row > line) {
				for(int i=0; i<row; i++) {
					for(int j=0; j<line; j++) {
						map.put(board[j][i], map.getOrDefault(board[j][i], 0) + 1);
					}
				}
			}
			
			
			
			
		}

	}

}
