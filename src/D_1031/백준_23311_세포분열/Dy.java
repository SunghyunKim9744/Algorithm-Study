package D_1031.백준_23311_세포분열;

import java.util.Scanner;


/*
 * 
 * 	https://www.acmicpc.net/problem/2115
 * 
 */
public class Dy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(Dy.class.getResourceAsStream("input.txt"));
		
		String[] temp = sc.nextLine().split(" ");
		
		int M = Integer.parseInt(temp[0]);
		int N = Integer.parseInt(temp[1]);
		
		String[][] board = new String[M][N];
		
		for(int i=0; i<M; i++) {
			board[i] = sc.nextLine().split("");
		}
		
		int cnt = 0;
		int wall = 0;
		int answer = 0;
		for(int i=1; i<M; i++) {
			for(int j=1; j<N; j++) {
				if(board[i][j].equals("X")) {
					if(board[i-1][j].equals(".")) {
						if(wall != 1) {
							cnt = 0;
						}
						wall = 1;
						cnt++;
						if(cnt % 2 == 0) {
							cnt = 0;
							answer++;
						}
					}else {
						cnt = 0;
						wall = 0;
					}
				}else if(board[i][j].equals(".")) {
					if(board[i-1][j].equals("X")) {
						if(wall != 2) {
							cnt = 0;
						}
						wall = 2;
						cnt++;
						if(cnt % 2 == 0) {
							cnt = 0;
							answer++;
						}
					}else {
						cnt = 0;
						wall = 0;
					}
				}
			}
			cnt = 0;
			wall = 0;
		}
		for(int i=1; i<N; i++) {
			for(int j=1; j<M; j++) {
				if(board[j][i].equals("X")) {
					if(board[j][i-1].equals(".")) {
						if(wall != 1) {
							cnt = 0;
						}
						wall = 1;
						cnt++;
						if(cnt % 2 == 0) {
							cnt = 0;
							answer++;
						}
					}else {
						cnt = 0;
						wall = 0;
					}
				}else if(board[j][i].equals(".")) {
					if(board[j][i-1].equals("X")) {
						if(wall != 2) {
							cnt = 0;
						}
						wall = 2;
						cnt++;
						if(cnt % 2 == 0) {
							cnt = 0;
							answer++;
						}
					}else {
						cnt = 0;
						wall = 0;
					}
				}
			}
			cnt = 0;
			wall = 0;
		}
		System.out.println(answer);
	}
}
